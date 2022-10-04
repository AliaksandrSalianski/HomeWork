package task7and8.dto;

import homeWork_6.api.ISearchEngine;
import homeWork_6.util.EasySearch;
import task7and8.api.ILocalFileService;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 *
 */
public class LocalStorageFileService implements ILocalFileService {

    private final String fileSeparator = System.getProperty("file.separator");
    private final String resultFolderPath = "Course" + fileSeparator + "JD1" + fileSeparator + "HomeWork" + fileSeparator + "src" + fileSeparator + "homeWork_6" + fileSeparator + "result.txt";


    public String getResultFolderPath() {
        return resultFolderPath;
    }

    /**
     *
     * @return
     */
    @Override
    public String createNewFile() {
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
     *
     * @param resultFolderPath
     * @param file
     * @param text
     * @param wordToFind
     */

    @Override
    public void findWithISearchEngineAndPutResultInFolder(String resultFolderPath, String file, String text, String wordToFind) {
        ISearchEngine easySearch = new EasySearch();
        long countOfWord = easySearch.search(text, wordToFind);
        String putToFolderResult = file + "-" + wordToFind + "-" + countOfWord + System.lineSeparator();
        writeToFile(putToFolderResult, resultFolderPath);
    }

    /**
     *
     * @param foundedFile
     * @return
     */
    @Override
    public String getText(Path foundedFile) {
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(foundedFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(bytes, UTF_8);
    }

    /**
     *
     * @param enteredPathByUser
     * @return
     */
    @Override
    public List<Path> getAllFiles(String enteredPathByUser) {
        try {
            return Files.list(Paths.get(enteredPathByUser))
                    .filter(filePath -> filePath.getFileName().toString().contains(".txt"))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("не верный ввод");
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @param fooStr
     * @param fooPath
     */
    @Override
    public void writeToFile(String fooStr, String fooPath) {
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
     *
     * @return
     */
    @Override
    public String makeStringWithBuffer() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    /**
     *
     * @param filePaths          список файлов
     * @param selectedFileToWork файл который ищем
     * @return
     */
    @Override
    public Path findFileInListPath(List<Path> filePaths, String selectedFileToWork) {
        Path foundedFile = null;
        for (Path filePath : filePaths)
            if (filePath.getFileName().toString().equals(selectedFileToWork)) {
                foundedFile = filePath;
                break;
            }
        if (foundedFile == null) {
            System.out.println("Файл не найден");
        }
        return null;
    }

    /**
     *
     * @param filePaths
     */
    @Override
    public void printAllTxtFileNameInFolder(List<Path> filePaths) {
        for (Path p : filePaths) {
            System.out.println(p.getFileName().toString());
        }
    }

    /**
     *
     * @param pathFolderToSaveResult
     * @param selectedFileToWork
     * @param text
     */
    public void workWitExecuteService(String pathFolderToSaveResult, String selectedFileToWork, String text) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        while (true) {
            System.out.println("Введите \"слово_для_поиска\" или \"Esc\" для выхода из программы");
            String wordToFind = makeStringWithBuffer();
            if (Objects.equals(wordToFind, "Esc")) {
                break;
            } else {
                executorService.execute(() -> findWithISearchEngineAndPutResultInFolder(pathFolderToSaveResult, selectedFileToWork, text, wordToFind));
            }
        }
        executorService.shutdown();
    }
}
