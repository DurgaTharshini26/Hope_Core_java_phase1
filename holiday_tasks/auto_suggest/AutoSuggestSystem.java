package auto_suggest;
import java.util.List;

public class AutoSuggestSystem {
    private WordRepository repository;
    private SuggestionService service;

    public AutoSuggestSystem() {
        repository = new WordRepository();
        service = new SuggestionService();
    }

    public void loadWords(List<String> words) {
        for (String word : words) {
            repository.addWord(word);
        }
    }

    public List<String> suggest(String prefix) {
        return service.getSuggestions(prefix, repository.getAllWords());
    }
}
