package survey_system.model;

import java.util.ArrayList;

// ENCAPSULATION: Survey protects its data with private fields and controlled methods
public class Survey {

    private String surveyId;
    private String title;
    private String description;
    private ArrayList<Question> questions; // can hold ANY type of question (Polymorphism)
    private boolean isActive;             // true = open for responses, false = closed

    public Survey(String surveyId, String title, String description) {
        this.surveyId    = surveyId;
        this.title       = title;
        this.description = description;
        this.questions   = new ArrayList<>();
        this.isActive    = false; // starts as inactive (draft)
    }

    // Add a question to this survey
    public void addQuestion(Question question) {
        questions.add(question);
        //System.out.println("  Question added: " + question.getQuestionText());
    }

    // Activate the survey so people can answer it
    public void activate() {
        if (questions.isEmpty()) {
            //System.out.println("  Cannot activate: survey has no questions!");
            return;
        }
        isActive = true;
        //System.out.println("  Survey '" + title + "' is now ACTIVE.");
    }

    // Close the survey
    public void close() {
        isActive = false;
        System.out.println("  Survey '" + title + "' is now CLOSED.");
    }

    // Display all questions
    public void displayQuestions() {
        System.out.println("\n===== " + title + " =====");
        System.out.println(description);
        System.out.println("---------------------------");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            questions.get(i).display();
        }

    }

    // Getters
    public String getSurveyId()              { return surveyId; }
    public String getTitle()                 { return title; }
    public ArrayList<Question> getQuestions(){ return questions; }
    public boolean isActive()                { return isActive; }
}