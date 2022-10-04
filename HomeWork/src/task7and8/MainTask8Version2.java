package task7and8;

import task7and8.api.ILocalFileService;
import task7and8.dto.LocalStorageFileService;

import java.nio.file.Path;
import java.util.List;

/**
 * Класс реализует работу с текстовыми файлами находящиеся в папке которую указал пользователь. В текстовом файле  производится поиск  вводимого  слова и результат
 * сохраняется в папку указанную пользователем
 */
public class MainTask8Version2 {
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
        System.out.println("Файл найден");
        String text = worker.getText(foundedFile);
        System.out.println("Хотите создать файл для сохранния результатов?");
        System.out.println("Yes/No");
        String yesOrNotChoice = worker.makeStringWithBuffer();
        String pathFolderToSaveResult = worker.getResultFolderPath();
        if (yesOrNotChoice.equalsIgnoreCase("yes")) {
            pathFolderToSaveResult = worker.createNewFile();
        } else {
            System.out.println("Ok, сохранение в файл по адресу : " + worker.getResultFolderPath());
        }
        worker.workWitExecuteService(pathFolderToSaveResult, selectedFileToWork, text);
        System.out.println("exit");
    }
}
