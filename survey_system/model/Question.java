package survey_system.model;
// ABSTRACTION: abstract class hides complexity, forces subclasses to implement their own validateAnswer
import survey_system.Exception.ValidationException;
public abstract class Question {

    private String questionId;
    private String questionText;
    private boolean isRequired;

    public Question(String questionId, String questionText, boolean isRequired) {
        this.questionId   = questionId;
        this.questionText = questionText;
        this.isRequired   = isRequired;
    }

    // throws ValidationException added here
    public abstract boolean validateAnswer(String answer) throws ValidationException;
    public abstract String getType();

    public String getQuestionId()   { return questionId; }
    public String getQuestionText() { return questionText; }
    public boolean isRequired()     { return isRequired; }

    public void display() {
        System.out.println("[" + getType() + "] " + questionText);
        if (isRequired) {
            System.out.println("  (Required)");
        }
    }
}