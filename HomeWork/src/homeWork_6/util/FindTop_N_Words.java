package homeWork_6.util;

import homeWork_6.sort.SortWithStream;

import java.util.*;

public class FindTop_N_Words {
    public static void printTopWords(Map<String, Integer> inputMap, Integer countOfWordsToFind) {
        LinkedHashMap<String, Integer> sortMapByValues = SortWithStream.sortingTheMap(inputMap);
        List<String> listOfValues = new ArrayList<>(sortMapByValues.keySet());
        System.out.printf("В книге то %d слов являются :",countOfWordsToFind);
        for (int i = 0; i <= countOfWordsToFind; i++) {
            String foo = listOfValues.get(i);
            System.out.println(foo + "-" + inputMap.get(foo) + "раз");
        }
    }
}

