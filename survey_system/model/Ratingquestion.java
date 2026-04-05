package survey_system.model;
// INHERITANCE: RatingQuestion extends Question
import survey_system.Exception.ValidationException;

public class Ratingquestion extends Question {

    private int minRating;
    private int maxRating;

    public Ratingquestion(String questionId, String questionText,
                          boolean isRequired, int minRating, int maxRating) {
        super(questionId, questionText, isRequired);
        this.minRating = minRating;
        this.maxRating = maxRating;
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
        int rating;
        try {
            rating = Integer.parseInt(answer.trim());
        } catch (NumberFormatException e) {
            throw new ValidationException(getQuestionId(),
                    "Please enter a number.");
        }
        if (rating < minRating || rating > maxRating) {
            throw new ValidationException(getQuestionId(),
                    "Rating must be between " + minRating + " and " + maxRating);
        }
        return true;
    }

    @Override
    public String getType() { return "RATING"; }

    @Override
    public void display() {
        super.display();
        System.out.println("  (Enter a number from " + minRating + " to " + maxRating + ")");
    }

    public int getMinRating() { return minRating; }
    public int getMaxRating() { return maxRating; }
}