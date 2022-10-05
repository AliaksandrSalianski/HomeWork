package task7and8.runner;

import task7and8.api.ILocalFileService;
import task7and8.dto.LocalStorageFileService;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

/**
 * Класс реализует работу с текстовыми файлами находящиеся в папке которую указал пользователь. В текстовом файле  ищется количество употребления вводимого  слова и результат
 * поиска сохраняется в папку указанную пользователем
 */
public class MainTask7Version2 {
    public static void main(String[] args) {
        ILocalFileService worker = new LocalStorageFileService();
        System.out.println("Введите адрес папки");
        String enteredPathByUser = worker.makeStringWithBuffer();
        List<Path> filePaths = worker.getAllFiles(enteredPathByUser);
        System.out.println("Все \"txt\" файлы в выбранной папке:");
        worker.printAllTxtFileNameInFolder(filePaths);
        System.out.println("Укажите файл для последующей работы");
        String selectedFileToWork = worker.makeStringWithBuffer();
        Path foundedFile = worker.findFileInListPath(filePaths, selectedFileToWork);
        if (foundedFile == null) return;
        System.out.println("выбран файл: " + selectedFileToWork);
        String text = worker.getText(foundedFile);
        System.out.println("Хотите создать файл для сохранния результатов?");
        System.out.println("Yes/No");
        String yesOrNotChoice = worker.makeStringWithBuffer();
        String pathFolderToSaveResult = worker.getResultFolderPath();
        if (yesOrNotChoice.equalsIgnoreCase("yes")) {
            pathFolderToSaveResult = worker.createNewFile();
        } else {
            worker.checkResultFileExistOrNot(worker.getResultFolderPath());
            System.out.println("Ok, сохранение в файл по адресу : " + worker.getResultFolderPath());
        }
        while (true) {
            System.out.println("Введите \"Слово_для_поиска\" или \"Esc\" для выхода из программы");
            String wordToFind = worker.makeStringWithBuffer();
            if (Objects.equals(wordToFind, "Esc")) {
                break;
            } else {
                worker.findWithISearchEngineAndPutResultInFolder(pathFolderToSaveResult, selectedFileToWork, text, wordToFind);
            }
        }
        System.out.println("exit");
    }
}