package homeWork_6.util;

import java.util.HashMap;
import java.util.Map;

public class MakeMap {
    public static Map<String, Integer> makingMap(String fileName)  {
        String foo = LineFromFile.makingStringFromFile(fileName);
        String [] fooStrArray = MakeArrayOfWords.splitString(foo);
        Map<String, Integer> resultMap = new HashMap<String, Integer>();
        for (String str : fooStrArray) {
            resultMap.merge(str, 1, Integer::sum);
        }
        return resultMap;
    }
}