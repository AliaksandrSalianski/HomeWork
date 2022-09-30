package homeWork_6.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * класс реализут скачивание из файла текст
 */
public class LineFromFile {
    /**
     * метод сохраняет в строку текст из файла
     * @param fileName адрес файла
     * @return строку с текстом из файла
     */
    public static String makingStringFromFile(String fileName)  {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
        return fileName;
    }
}
// discuss..