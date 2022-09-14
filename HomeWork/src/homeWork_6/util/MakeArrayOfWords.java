package homeWork_6.util;

/**
 * класс реализует разделение строки на отдельные слова
 */
public class MakeArrayOfWords {
    /**
     * метод разделения
     * @param str строка которую необходимо разделить на слова
     * @return массив строк
     */
    public static String[] splitString(String str) {
        return str.split("(?U)\\W+");
    }
}
