package survey_system.main;
import survey_system.model.*;
import survey_system.service.Surveyservice;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Surveyservice service = new Surveyservice();

        System.out.println("============================================================");
        System.out.println("                  SURVEY SYSTEM                            ");
        System.out.println("============================================================");
        Survey survey = new Survey("S001", "Customer Satisfaction Survey",
                "Please answer all questions honestly.");

        ArrayList<String> options = new ArrayList<>();
        options.add("Price");
        options.add("Quality");
        options.add("Support");
        options.add("Delivery");

        survey.addQuestion(new Textquestion(
                "Q1", "What is your full name?", true, 3, 40));
        survey.addQuestion(new Ratingquestion(
                "Q2", "Rate our service (1 to 5)", true, 1, 5));
        survey.addQuestion(new MultipleChoiceQuestion(
                "Q3", "What did you like most?", true, options));

        survey.activate();
        service.addSurvey(survey);
        System.out.print("\nHow many users want to fill this survey? ");
        int userCount = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 1; i <= userCount; i++) {

            System.out.println("\n------------------------------------------------------------");
            System.out.println("  User " + i + " Registration");
            System.out.println("------------------------------------------------------------");

            System.out.print("  Enter your name  : ");
            String name = scanner.nextLine().trim();

            System.out.print("  Enter your email : ");
            String email = scanner.nextLine().trim();

            User user = new User("U00" + i, name, email);
            System.out.println("  Welcome, " + user.getName() + "!");

            
            survey.displayQuestions();

            System.out.println("\n  Please answer the questions below:");
            ArrayList<String> answers = new ArrayList<>();

            for (int q = 0; q < survey.getQuestions().size(); q++) {
                System.out.print("  Answer Q" + (q + 1) + ": ");
                String answer = scanner.nextLine().trim();
                answers.add(answer);
            }

            // Submit and validate
            System.out.println("\n  Submitting your response...");
            boolean accepted = service.submitResponse(survey, user, answers);

    
            if (!accepted) {
                System.out.println("\n  Would you like to try again? (yes / no)");
                System.out.print("  Your choice: ");
                String retry = scanner.nextLine().trim();

                if (retry.equalsIgnoreCase("yes")) {
                    System.out.println("\n  Enter your answers again:");
                    ArrayList<String> retryAnswers = new ArrayList<>();

                    for (int q = 0; q < survey.getQuestions().size(); q++) {
                        System.out.print("  Answer Q" + (q + 1) + ": ");
                        String answer = scanner.nextLine().trim();
                        retryAnswers.add(answer);
                    }

                    System.out.println("\n  Submitting again...");
                    service.submitResponse(survey, user, retryAnswers);
                } else {
                    System.out.println("  Skipping " + user.getName() + "'s response.");
                }
            }
        }
        service.showReport(survey);
        service.listSurveys();

        System.out.println("                    THANK YOU!                             ");
       

        scanner.close();
    }
}