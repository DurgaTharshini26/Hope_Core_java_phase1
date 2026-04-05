package survey_system.Exception;

// Custom exception for when an answer fails validation
// This is our own exception class that extends Exception
public class ValidationException extends Exception {

    private String questionId;

    public ValidationException(String questionId, String message) {
        super(message);           // passes message to Exception parent
        this.questionId = questionId;
    }

    public String getQuestionId() {
        return questionId;
    }
}

