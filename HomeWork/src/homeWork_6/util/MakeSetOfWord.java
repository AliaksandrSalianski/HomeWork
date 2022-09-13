package homeWork_6.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MakeSetOfWord {

    public static Set<String> makingSet(String str) {
        return new HashSet<>(Arrays.asList(MakeArrayOfWords.splitString(str)));
    }
}
