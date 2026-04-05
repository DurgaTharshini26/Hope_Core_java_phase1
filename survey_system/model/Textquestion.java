package survey_system.model;


// INHERITANCE: TextQuestion extends Question (gets all Question fields + methods)
public class Textquestion extends Question {

    private int minLength; // minimum characters required
    private int maxLength; // maximum characters allowed

    // Constructor calls super() to set up parent class fields
    public Textquestion(String questionId, String questionText, boolean isRequired,
                        int minLength, int maxLength) {
        super(questionId, questionText, isRequired); // calls Question constructor
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    // POLYMORPHISM: our own version of validateAnswer
    // checks if answer length is within the allowed range
    @Override
    public boolean validateAnswer(String answer) {
        if (answer == null || answer.trim().isEmpty()) {
            if (isRequired()) {
                System.out.println("  ERROR: This question is required!");
                return false;
            }
            return true; // empty answer is ok if not required
        }

        if (answer.length() < minLength) {
            System.out.println("  ERROR: Answer too short. Minimum " + minLength + " characters.");
            return false;
        }

        if (answer.length() > maxLength) {
            System.out.println("  ERROR: Answer too long. Maximum " + maxLength + " characters.");
            return false;
        }

        return true; // valid!
    }

    // POLYMORPHISM: our own version of getType
    @Override
    public String getType() {
        return "TEXT";
    }

    // Override display to show length hint
    @Override
    public void display() {
        super.display(); // call parent display first
        System.out.println("  (Enter between " + minLength + " and " + maxLength + " characters)");
    }
}
