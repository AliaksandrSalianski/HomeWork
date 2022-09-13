package homeWork_6.util;

public class MakeArrayOfWords {
    public static String[] splitString(String str) {
        return str.split("(?U)\\W+");
    }
}
