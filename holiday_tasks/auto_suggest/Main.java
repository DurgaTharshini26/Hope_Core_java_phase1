package auto_suggest;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        AutoSuggestSystem system = new AutoSuggestSystem();

        List<String> words = Arrays.asList(

            // Technology
            "algorithm", "array", "api", "application", "app", "android",
            "backend", "binary", "bug", "browser",
            "cloud", "code", "compiler", "css", "cybersecurity",
            "data", "database", "debug", "development", "deployment",
            "function", "frontend", "framework",
            "java", "javascript", "json",
            "machinelearning", "model", "module",
            "network", "node", "nullpointer",
            "object", "oop", "operator",
            "python", "program", "project",
            "queue", "query",
            "recursion", "runtime",
            "stack", "string", "syntax",
            "tree", "thread",

            // Real-world common words
            "apple", "appetite", "apply", "approval",
            "bank", "balance", "basket", "battery",
            "car", "camera", "career", "cart",
            "dog", "door", "download",
            "email", "energy", "engine",
            "food", "file", "filter",
            "game", "google", "goal",
            "home", "hotel", "house",
            "idea", "input", "internet",
            "job", "join", "journey",
            "key", "keyboard",
            "learn", "level", "login",
            "map", "message", "mobile",
            "name", "networking",
            "open", "order", "online",
            "payment", "phone", "photo",
            "question", "quick",
            "result", "report",
            "search", "system", "software",
            "time", "task", "technology",
            "user", "update",
            "value", "video",
            "work", "world", "website",
            "year", "youtube",
            "zero", "zebra"
        );

        system.loadWords(words);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter prefix: ");
        String input = sc.nextLine();

        List<String> suggestions = system.suggest(input);

        System.out.println("Suggestions:");

        if (suggestions.isEmpty()) {
            System.out.println("No suggestions found");
        } else {
            for (String s : suggestions) {
                System.out.println(s);
            }
        }
    }
}