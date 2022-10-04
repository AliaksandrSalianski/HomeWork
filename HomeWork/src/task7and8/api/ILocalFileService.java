package task7and8.api;

import java.nio.file.Path;
import java.util.List;

/**
 * Интерфейс поиска слов в текстовом файле в локальной системе и сохранения результатов в файл
 */
public interface ILocalFileService {

    Path findFileInListPath(List<Path> filePaths, String selectedFileToWork);

    void printAllTxtFileNameInFolder(List<Path> filePaths);

    void workWitExecuteService(String pathFolderToSaveResult, String selectedFileToWork, String text);

    String getResultFolderPath();

    String createNewFile();

    void findWithISearchEngineAndPutResultInFolder(String resultFolderPath, String file, String text, String wordToFind);

    String getText(Path foundedFile);

    List<Path> getAllFiles(String enteredPathByUser);

    void writeToFile(String fooStr, String fooPath);

    String makeStringWithBuffer();
}
