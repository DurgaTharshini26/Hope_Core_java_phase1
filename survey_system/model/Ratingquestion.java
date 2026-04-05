package survey_system.model;


// INHERITANCE: RatingQuestion extends Question
public class Ratingquestion extends Question {

    private int minRating;
    private int maxRating;

    public Ratingquestion(String questionId, String questionText, boolean isRequired,
                          int minRating, int maxRating) {
        super(questionId, questionText, isRequired);
        this.minRating = minRating;
        this.maxRating = maxRating;
    }

    // POLYMORPHISM: validates that the answer is a number within the allowed range
    @Override
    public boolean validateAnswer(String answer) {
        if (answer == null || answer.trim().isEmpty()) {
            if (isRequired()) {
                System.out.println("  ERROR: This question is required!");
                return false;
            }
            return true;
        }

        // Try to convert the answer to a number
        int rating;
        try {
            rating = Integer.parseInt(answer.trim());
        } catch (NumberFormatException e) {
            System.out.println("  ERROR: Please enter a number.");
            return false;
        }

        if (rating < minRating || rating > maxRating) {
            System.out.println("  ERROR: Rating must be between " + minRating + " and " + maxRating);
            return false;
        }

        return true; // valid!
    }

    @Override
    public String getType() {
        return "RATING";
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  (Enter a number from " + minRating + " to " + maxRating + ")");
    }

    // Getters
    public int getMinRating() { return minRating; }
    public int getMaxRating() { return maxRating; }
}
    

