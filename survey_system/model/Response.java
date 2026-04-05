package survey_system.model;

import java.util.ArrayList;

// ENCAPSULATION: Response keeps the respondent's answers private
public class Response {

    private String responseId;
    private String surveyId;
    private String respondentName;
    private ArrayList<String> answers; // one answer per question, in order

    public Response(String responseId, String surveyId, String respondentName) {
        this.responseId     = responseId;
        this.surveyId       = surveyId;
        this.respondentName = respondentName;
        this.answers        = new ArrayList<>();
    }

    // Add one answer (called once per question)
    public void addAnswer(String answer) {
        answers.add(answer);
    }

    // Print a summary of this response
    public void displaySummary(Survey survey) {
        System.out.println("\n----- Response by: " + respondentName + " -----");
        ArrayList<Question> questions = survey.getQuestions();

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Q: " + questions.get(i).getQuestionText());
            if (i < answers.size()) {
                System.out.println("A: " + answers.get(i));
            } else {
                System.out.println("A: (no answer)");
            }
        }
    }

    // Getters
    public String getResponseId()         { return responseId; }
    public String getSurveyId()           { return surveyId; }
    public String getRespondentName()     { return respondentName; }
    public ArrayList<String> getAnswers() { return answers; }
}