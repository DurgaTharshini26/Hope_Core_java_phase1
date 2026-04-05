package survey_system.model;

import java.util.ArrayList;

// INHERITANCE: MultipleChoiceQuestion extends Question
public class MultipleChoiceQuestion extends Question {

    // ENCAPSULATION: private list of options
    private ArrayList<String> options;

    public MultipleChoiceQuestion(String questionId, String questionText,
                                  boolean isRequired, ArrayList<String> options) {
        super(questionId, questionText, isRequired);
        this.options = options;
    }

    // POLYMORPHISM: validates that the answer matches one of the given options
    @Override
    public boolean validateAnswer(String answer) {
        if (answer == null || answer.trim().isEmpty()) {
            if (isRequired()) {
                System.out.println("  ERROR: This question is required!");
                return false;
            }
            return true;
        }

        // Check if the answer matches any option (ignore uppercase/lowercase)
        for (String option : options) {
            if (option.equalsIgnoreCase(answer.trim())) {
                return true; // found a match!
            }
        }

        System.out.println("  ERROR: Please choose one of the given options.");
        return false;
    }

    @Override
    public String getType() {
        return "MULTIPLE CHOICE";
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Options:");
        for (int i = 0; i < options.size(); i++) {
            System.out.println("    " + (i + 1) + ". " + options.get(i));
        }
    }

    public ArrayList<String> getOptions() {
        return options;
    }
}