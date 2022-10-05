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
 * Класс реализует работу с текстовыми файлами на локальной системе
 */
public class LocalStorageFileService implements ILocalFileService {

    private final String fileSeparator = System.getProperty("file.separator");
    private final String resultFolderPath = "Course" + fileSeparator + "JD1" + fileSeparator + "HomeWork" + fileSeparator + "src" + fileSeparator + "homeWork_6" + fileSeparator + "result.txt";


    public String getResultFolderPath() {
        return resultFolderPath;
    }

    /**
     * Метод создает новый файл
     *
     * @return путь к файлу
     */
    @Override
    public String createNewFile() {
        File file;
        System.out.println("Введите имя файла");
        file = new File(makeStringWithBuffer());
        try {
            if (file.createNewFile()) {
                System.out.println(file.getName() + " файл создан в корневой директории проекта");
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
     * Метод ищет слово в текстовом документе и записывает результат поиска в файл
     *
     * @param resultFolderPath путь к папке в которую сохраняетяся результат поиска
     * @param file             файл в котором находится текстовы документ
     * @param text             текст в котором ищем слово
     * @param wordToFind       слово которое ищем
     */

    @Override
    public void findWithISearchEngineAndPutResultInFolder(String resultFolderPath, String file, String text, String wordToFind) {
        ISearchEngine easySearch = new EasySearch();
        long countOfWord = easySearch.search(text, wordToFind);
        String putToFolderResult = file + "-" + wordToFind + "-" + countOfWord + System.lineSeparator();
        writeToFile(putToFolderResult, resultFolderPath);
    }

    /**
     * Метод возвращает текст из текстового файла
     *
     * @param foundedFile файл с текстом
     * @return строку
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
     * Метод находит все txt файлы в папке которую ввел пользователь
     *
     * @param enteredPathByUser водимый путь пользователем
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
     * метод записывает в файл
     *
     * @param fooStr  строка которую нужно записать
     * @param fooPath путь
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
     * Метод для работы с консолью пользователем
     *
     * @return возвращает строку которую ввел пользователь
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
     * Метод проверяет наличие файла по пути , создает новый  если файла нет
     *
     * @param pathToResultFile путь к файлу
     */
    @Override
    public void checkResultFileExistOrNot(String pathToResultFile) {
        try {
            File f = new File(pathToResultFile);
            if (f.createNewFile())
                System.out.println("Создали файл ");
            else {
                System.out.println("Файл уже сущесьвует");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Метод ищет нужный файл в списке
     *
     * @param filePaths          список файлов
     * @param selectedFileToWork файл который ищем
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
        return foundedFile;
    }

    /**
     * Метод выводит имена txt файлов
     *
     * @param filePaths список файлов
     */
    @Override
    public void printAllTxtFileNameInFolder(List<Path> filePaths) {
        for (Path p : filePaths) {
            System.out.println(p.getFileName().toString());
        }
    }

    /**
     * метод ищет слово в тексте и записывает результат в файл
     *
     * @param pathFolderToSaveResult путь до папки куда будет сохранен результат
     * @param selectedFileToWork     файл в котором нужно искать
     * @param text                   текст в котором ищем
     */
    public void workWitExecuteService(String pathFolderToSaveResult, String selectedFileToWork, String text) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        while (true) {
            System.out.println("Введите \"слово_для_поиска\" или \"Esc\" для выхода");
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


