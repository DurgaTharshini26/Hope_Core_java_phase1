package auto_suggest;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class WordRepository {
    private Set<String> words;

    public WordRepository() {
        words = new HashSet<>();
    }

    public void addWord(String word) {
        words.add(word.toLowerCase()); // store in lowercase
    }

    public List<String> getAllWords() {
        return new ArrayList<>(words);
    }
}