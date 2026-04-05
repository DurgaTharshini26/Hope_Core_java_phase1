package survey_system.model;

// ABSTRACTION: abstract class hides complexity, forces subclasses to implement their own validateAnswer
public abstract class Question {

    // ENCAPSULATION: private fields - can only be accessed through getters
    private String questionId;
    private String questionText;
    private boolean isRequired;

    // Constructor
    public Question(String questionId, String questionText, boolean isRequired) {
        this.questionId   = questionId;
        this.questionText = questionText;
        this.isRequired   = isRequired;
    }

    // ABSTRACTION: abstract methods - every subclass MUST implement these
    // This is where POLYMORPHISM happens - each subclass validates differently
    public abstract boolean validateAnswer(String answer);

    public abstract String getType();

    // Getters (ENCAPSULATION - controlled access to private fields)
    public String getQuestionId()   { return questionId; }
    public String getQuestionText() { return questionText; }
    public boolean isRequired()     { return isRequired; }

    // Display the question nicely
    public void display() {
        System.out.println("[" + getType() + "] " + questionText);
        if (isRequired) {
            System.out.println("  (Required)");
        }
    }
}