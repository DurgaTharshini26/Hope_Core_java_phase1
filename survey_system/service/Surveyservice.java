package survey_system.service;

import survey_system.Exception.ValidationException;
import survey_system.model.*;
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
    }

    public Survey findSurvey(String surveyId) {
        for (Survey s : allSurveys) {
            if (s.getSurveyId().equals(surveyId)) {
                return s;
            }
        }
        System.out.println("  Survey not found: " + surveyId);
        return null;
    }

    public boolean submitResponse(Survey survey, User user, ArrayList<String> answers) {

        if (!survey.isActive()) {
            System.out.println("  BLOCKED: Survey is not active.");
            return false;
        }

        ArrayList<Question> questions = survey.getQuestions();

        if (answers.size() != questions.size()) {
            System.out.println("  BLOCKED: Answer count does not match question count.");
            return false;
        }

        System.out.println("\n  Validating answers for: " + user.getName());
        boolean allValid = true;

        for (int i = 0; i < questions.size(); i++) {
            String   answer   = answers.get(i);
            Question question = questions.get(i);

            System.out.print("  Q" + (i + 1) + " [" + question.getType() + "] --> ");

            try {
                question.validateAnswer(answer);
                System.out.println("  Answer: '" + answer + "' ... OK");

            } catch (ValidationException e) {
                System.out.println("  ERROR on " + e.getQuestionId()
                        + ": " + e.getMessage());
                allValid = false;
            }
        }

        if (!allValid) {
            System.out.println("\n  RESULT: Submission REJECTED. Please fix the errors.");
            return false;
        }

        String responseId = "RSP-" + nextResponseId++;
        Response response = new Response(responseId, survey.getSurveyId(), user.getName());
        for (String answer : answers) {
            response.addAnswer(answer);
        }
        allResponses.add(response);
        System.out.println("\n  RESULT: Submission ACCEPTED! (Response ID: " + responseId + ")");
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
        System.out.println("\n  All surveys in the system:");
        for (Survey s : allSurveys) {
            System.out.println("  [" + s.getSurveyId() + "] "
                    + s.getTitle()
                    + "  |  Status: "    + (s.isActive() ? "ACTIVE" : "CLOSED")
                    + "  |  Questions: " + s.getQuestions().size());
        }
    }
}