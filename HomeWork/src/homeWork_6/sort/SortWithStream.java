package homeWork_6.sort;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortWithStream {
    public static LinkedHashMap<String, Integer> sortingTheMap(Map<String, Integer> inputMap) {
        return inputMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }
}
