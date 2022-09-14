package homeWork_6.util;

import java.util.HashMap;
import java.util.Map;

/**
 * класс реализует преобразование текста в файле в коллекцию типа Мар
 */
public class MakeMap {
    /**
     * метод скачивает из файла текст и преобразует в Мар где ключ - это слово, а значение количество употребления слова в тексте
     *
     * @param fileName адрес файла
     * @return возвращает Map<String,Integer>
     */
    public static Map<String, Integer> makingMap(String fileName) {
        String foo = LineFromFile.makingStringFromFile(fileName);
        String[] fooStrArray = MakeArrayOfWords.splitString(foo);
        Map<String, Integer> resultMap = new HashMap<>();
        for (String str : fooStrArray) {
            resultMap.merge(str, 1, Integer::sum);
        }
        return resultMap;
    }
}