package StarterTask7and8;

import homeWork_6.util.EasySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_8;

public class One {
    public static void main(String[] args) {
        final String resultFolderPath = "E:\\ideaProjectsAcademy\\Course\\JD1\\HomeWork\\src\\homeWork_6\\result.txt";
        final String libraryFolderPath = "E:\\ideaProjectsAcademy\\Course\\JD1\\HomeWork\\src\\homeWork_6\\library";//TODO переделатть на относительный
        Path foundedFile = null;

        System.out.println("Введите папку");
        String enteredPathByUser = makeStringWithBuffer();
        if (!Objects.equals(enteredPathByUser, libraryFolderPath)) {
            System.out.println("Папки не существует");
            return;
        } else {
            System.out.println("Все файлы");
        }
        List<Path> filePaths = getPaths(enteredPathByUser);
        System.out.println("Введите файл");
        String file = makeStringWithBuffer();
        for (Path filePath : filePaths) {
            if (filePath.getFileName().toString().equals(file)) {
                foundedFile = filePath;
                break;
            }
        }
        if (foundedFile == null) {
            System.out.println("Файл не найден");
            return;
        }
        System.out.println("Файл найден");

        String text = getText(foundedFile);

        while (true) {
            System.out.print("Введите \"слово_для_поиска\" или \"Esc \" для выхода из программы");
            String wordToFind = makeStringWithBuffer();
            if (Objects.equals(wordToFind, "Esc")) {//TODO возврат к списку файлов
                break;
            } else {
                EasySearch easySearch = new EasySearch();
                long countOfWord = easySearch.search(text, wordToFind);
                String putToFolderResult = file + "-" + wordToFind + "-" + countOfWord + System.lineSeparator();
                writeToFile(putToFolderResult, resultFolderPath);
            }
            System.out.println("exit");
        }
    }


    private static List<Path> getPaths(String enteredPathByUser) {
        List<Path> filePaths ;
        filePaths = getAllFiles(enteredPathByUser);
        assert filePaths != null;
        filePaths.forEach(System.out::println);
        return filePaths;
    }

    private static String getText(Path foundedFile) {
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(foundedFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(bytes, UTF_8);
    }

    private static List<Path> getAllFiles(String enteredPathByUser) {
        try {
            return Files.list(Paths.get(enteredPathByUser))
                    .filter(filePath -> filePath.getFileName().toString().contains(".txt"))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static void writeToFile(String fooStr, String fooPath) {
        Path p = Paths.get(fooPath);
        String s = System.lineSeparator() + fooStr;
        try (BufferedWriter writer = Files.newBufferedWriter(p, StandardOpenOption.APPEND)) {
            try {
                writer.write(s);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static String makeStringWithBuffer() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = bufferedReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

}