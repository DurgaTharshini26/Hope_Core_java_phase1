package survey_system.model;

import survey_system.Exception.ValidationException;
// INHERITANCE: TextQuestion extends Question (gets all Question fields + methods)
public class Textquestion extends Question {

    private int minLength;
    private int maxLength;

    public Textquestion(String questionId, String questionText,
                        boolean isRequired, int minLength, int maxLength) {
        super(questionId, questionText, isRequired);
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    @Override
    public boolean validateAnswer(String answer) throws ValidationException {
        if (answer == null || answer.trim().isEmpty()) {
            if (isRequired()) {
                throw new ValidationException(getQuestionId(),
                        "This question is required!");
            }
            return true;
        }
        if (answer.length() < minLength) {
            throw new ValidationException(getQuestionId(),
                    "Answer too short. Minimum " + minLength + " characters.");
        }
        if (answer.length() > maxLength) {
            throw new ValidationException(getQuestionId(),
                    "Answer too long. Maximum " + maxLength + " characters.");
        }
        return true;
    }

    @Override
    public String getType() { return "TEXT"; }

    @Override
    public void display() {
        super.display();
        System.out.println("  (Enter between " + minLength + " and " + maxLength + " characters)");
    }
}