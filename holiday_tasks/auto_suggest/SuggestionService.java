package auto_suggest;
import java.util.ArrayList;
import java.util.List;  
import java.util.*;

public class SuggestionService {

    public List<String> getSuggestions(String prefix, List<String> words) {

        List<String> result = new ArrayList<>();

        prefix = prefix.toLowerCase();

        for (String word : words) {
            if (word.startsWith(prefix)) {
                result.add(word);

                // Limit to top 5
                if (result.size() == 5) {
                    break;
                }
            }
        }

        // Sort results
        Collections.sort(result);

        return result;
    }
}