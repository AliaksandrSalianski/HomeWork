package starterTask7and8;

import homeWork_6.api.ISearchEngine;
import homeWork_6.util.EasySearch;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 *
 */
public class MainTask8 {
    public static void main(String[] args) {
        String fileSeparator = System.getProperty("file.separator");
        System.out.println("fileSeparator в текущей системе" + fileSeparator);
        final String resultFolderPath = "Course" + fileSeparator + "JD1" + fileSeparator + "HomeWork" + fileSeparator + "src" + fileSeparator + "homeWork_6" + fileSeparator + "result.txt";
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Path foundedFile = null;
        System.out.println("Введите адрес папки");
        String enteredPathByUser = makeStringWithBuffer();
        List<Path> filePaths = null;
        filePaths = getAllFiles(enteredPathByUser);
        System.out.println("Все \"txt\" файлы в выбранной папке:");
        assert filePaths != null;
        filePaths.forEach(System.out::println);//TODO сделать вывод с getName
        System.out.println("Укажите файл для последующей работы");
        String selectedFileToWork = makeStringWithBuffer();
        for (Path filePath : filePaths)
            if (filePath.getFileName().toString().equals(selectedFileToWork)) {
                foundedFile = filePath;
                break;
            }
        if (foundedFile == null) {
            System.out.println("Файл не найден");
            return;
        }
        System.out.println("Файл найден");
        String text = getText(foundedFile);
        System.out.println("Хотите создать файл для сохранния результатов?");
        System.out.println("Yes/No");
        String yesOrNotChoice = makeStringWithBuffer();
        String pathFolderToSaveResult = resultFolderPath;
        if (yesOrNotChoice.equalsIgnoreCase("yes")) {
            pathFolderToSaveResult = createNewFile();
        } else {
            System.out.println("Ok, сохранение в файл по адресу : " + resultFolderPath);
        }
        while (true) {
            System.out.println("Введите \"слово_для_поиска\" или \"Esc\" для выхода из программы");
            String wordToFind = makeStringWithBuffer();
            if (Objects.equals(wordToFind, "Esc")) {
                break;
            } else {
                findWithISearchEngineAndPutInFolder(pathFolderToSaveResult, selectedFileToWork, text, wordToFind);
            }
        }
        executorService.shutdown();
        System.out.println("exit");
    }

    /**
     * @return
     */
    private static String createNewFile() {
        File file;
        System.out.println("Введите имя файла");
        file = new File(makeStringWithBuffer());
        try {
            if (file.createNewFile()) {
                System.out.println(file.getName() + "файл создан в корневой директории проекта");
            } else {
                System.out.println(" файл уже существует в корневой директории проекта");
                System.out.println("Перезаписать?");
                System.out.println("yes/no");
                String foo = makeStringWithBuffer();
                return foo.equalsIgnoreCase("yes") ? createNewFile() : file.getPath();
            }
        } catch (IOException e) {
            System.out.println("неверный формат ввода ");
        }
        return file.getPath();
    }

    /**
     * @param resultFolderPath
     * @param file
     * @param text
     * @param wordToFind
     * @return
     */
    private static Runnable findWithISearchEngineAndPutInFolder(String resultFolderPath, String file, String text, String wordToFind) {
        ISearchEngine easySearch = new EasySearch();
        long countOfWord = easySearch.search(text, wordToFind);
        String putToFolderResult = file + "-" + wordToFind + "-" + countOfWord + System.lineSeparator();
        writeToFile(putToFolderResult, resultFolderPath);
        return null;
    }

    /**
     * @param foundedFile
     * @return
     */
    private static String getText(Path foundedFile) {
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(foundedFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(bytes, UTF_8);
    }

    /**
     * @param enteredPathByUser
     * @return
     */
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

    /**
     * @param fooStr
     * @param fooPath
     */
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

    /**
     * @return
     */
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