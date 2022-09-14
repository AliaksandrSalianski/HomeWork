package homeWork_6.sort;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * класс реализует сортировку по убыванию переданной коллекции
 */
public class SortWithStream {
    /**
     * метод сортировки
     * @param inputMap переданная коллекция для сортировки
     * @return отсортированная коллекция по убыванию
     */
    public static LinkedHashMap<String, Integer> sortingTheMap(Map<String, Integer> inputMap) {
        return inputMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }
}
