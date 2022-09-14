package homeWork_6.api;

/**
 * Определен метод для подсчета количества употребления слова в тексте
 */
public interface ISearchEngine {
    long search(String text, String word);
}
