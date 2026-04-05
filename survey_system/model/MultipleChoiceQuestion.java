package survey_system.model;

import java.util.ArrayList;

// INHERITANCE: MultipleChoiceQuestion extends Question
import survey_system.Exception.ValidationException;
public class MultipleChoiceQuestion extends Question {

    private ArrayList<String> options;
    public MultipleChoiceQuestion(String questionId, String questionText,
                                  boolean isRequired, ArrayList<String> options) {
        super(questionId, questionText, isRequired);
        this.options = options;
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
        for (String option : options) {
            if (option.equalsIgnoreCase(answer.trim())) {
                return true;
            }
        }
        throw new ValidationException(getQuestionId(),
                "Please choose one of the given options.");
    }

    @Override
    public String getType() { return "MULTIPLE CHOICE"; }

    @Override
    public void display() {
        super.display();
        System.out.println("  Options:");
        for (int i = 0; i < options.size(); i++) {
            System.out.println("    " + (i + 1) + ". " + options.get(i));
        }
    }

    public ArrayList<String> getOptions() { return options; }
}