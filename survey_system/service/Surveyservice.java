package survey_system.service;

import survey_system.model.Question;
import survey_system .model.Response;
import survey_system.model.User;
import survey_system.model.Survey;
import java.util.ArrayList;
public class Surveyservice {

    private ArrayList<Survey>   allSurveys;
    private ArrayList<Response> allResponses;
    private int nextResponseId;

    public Surveyservice() {
        allSurveys     = new ArrayList<>();
        allResponses   = new ArrayList<>();
        nextResponseId = 1;
    }

    public void addSurvey(Survey survey) {
        allSurveys.add(survey);
        //System.out.println("Survey registered: " + survey.getTitle());
    }

    public Survey findSurvey(String surveyId) {
        for (Survey s : allSurveys) {
            if (s.getSurveyId().equals(surveyId)) {
                return s;
            }
        }
        System.out.println("Survey not found: " + surveyId);
        return null;
    }

    // Accepts a User object now instead of just a name string
    public boolean submitResponse(Survey survey, User user, ArrayList<String> answers) {

        if (!survey.isActive()) {
            System.out.println("  BLOCKED: Survey '" + survey.getTitle() + "' is not active.");
            return false;
        }

        ArrayList<Question> questions = survey.getQuestions();

        if (answers.size() != questions.size()) {
            System.out.println("  BLOCKED: Answer count does not match question count.");
            return false;
        }

        System.out.println("  Validating answers...");
        boolean allValid = true;

        for (int i = 0; i < questions.size(); i++) {
            String answer     = answers.get(i);
            Question question = questions.get(i);

            System.out.print("  Q" + (i + 1) + " [" + question.getType() + "] --> ");

            // POLYMORPHISM: automatically calls the right validateAnswer()
            // TextQuestion, RatingQuestion, or MultipleChoiceQuestion version
            boolean valid = question.validateAnswer(answer);

            if (valid) {
                System.out.println("  Answer '" + answer + "' ... OK");
            }

            if (!valid) {
                allValid = false;
            }
        }

        if (!allValid) {
            System.out.println("  RESULT: Submission REJECTED.");
            return false;
        }

        String responseId = "RSP-" + nextResponseId++;
        Response response = new Response(responseId, survey.getSurveyId(), user.getName());
        for (String answer : answers) {
            response.addAnswer(answer);
        }
        allResponses.add(response);
        System.out.println("  RESULT: Submission ACCEPTED  (ID: " + responseId + ")");
        return true;
    }

    public void showReport(Survey survey) {
        System.out.println("\n========== REPORT: " + survey.getTitle() + " ==========");
        int count = 0;
        for (Response r : allResponses) {
            if (r.getSurveyId().equals(survey.getSurveyId())) {
                r.displaySummary(survey);
                count++;
            }
        }
        System.out.println("  Total responses collected: " + count);
        System.out.println("==============================================");
    }

    public void listSurveys() {
        System.out.println("  All surveys in the system:");
        for (Survey s : allSurveys) {
            System.out.println("  [" + s.getSurveyId() + "] "
                    + s.getTitle()
                    + "  |  Status: " + (s.isActive() ? "ACTIVE" : "CLOSED")
                    + "  |  Questions: " + s.getQuestions().size());
        }
    }
}