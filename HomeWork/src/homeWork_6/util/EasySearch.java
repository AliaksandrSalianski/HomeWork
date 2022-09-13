package homeWork_6.util;

import homeWork_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
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