package homeWork_6.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * класс реализует помещение слов из строки в Set
 */
public class MakeSetOfWord {
    /**
     * Метод разделяет полученную строку и помещает в Set
     * @param str переданная строка
     * @return Set<String>
     */
    public static Set<String> makingSet(String str) {
        return new HashSet<>(Arrays.asList(MakeArrayOfWords.splitString(str)));
    }
}
