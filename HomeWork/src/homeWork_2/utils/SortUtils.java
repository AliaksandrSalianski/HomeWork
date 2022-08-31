package homeWork_2.utils;

import java.util.Arrays;

/**
 * Сортировка массива метотом "Пузырька"
 */
public class SortUtils {
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = (arr.length - 1); j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int helper = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = helper;
                }
            }
        }
    }
}

