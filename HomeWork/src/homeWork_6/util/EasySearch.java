package homeWork_6.util;

import homeWork_6.api.ISearchEngine;

/**
 * класс реализует интерфейс ISearchEngine
 */
public class EasySearch implements ISearchEngine {
    /**
     * метод подсчитывет количество употребления слова в тексте
     *
     * @param text текст в котором ищем
     * @param word слово
     * @return возвращает подсчитанное количество
     */


    @Override
    public long search(String text, String word) {
        String[] fooStrArray = MakeArrayOfWords.splitString(text);
        long countResult = 0;
        for (String foo : fooStrArray) {
            if (foo.length() == word.length() && foo.indexOf(word) == 0) {
                countResult++;
            }
        }
        return countResult;
    }


}

