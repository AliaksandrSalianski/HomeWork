package homeWork_2.sort;

import homeWork_2.utils.ArraysUtils;
import homeWork_2.utils.SortUtils;

import java.util.Arrays;

/**
 * После каждого теста в консоль  распечатывается сообщение формата "[Какой массив был до сортировки] ->
 * [Каким стал массив после сортировки]".
 */
public class SortsMain {
    public static void main(String[] args) {
        SortUtils sortUtils = new SortUtils();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array2 = new int[]{1, 1, 1, 1};
        int[] array3 = new int[]{9, 1, 5, 99, 9, 9};
        int[] array4 = new int[]{};
        int[] array5 = new int[]{6, 5, 4, 3, 2, 1};
        int[] randomArray = ArraysUtils.arrayRandom(10, 100);
        int[] consoleArray = ArraysUtils.arrayFromConsole();


        System.out.print(Arrays.toString(array1) + "->");
        sortUtils.bubble(array1);
        System.out.println(Arrays.toString(array1));

        System.out.print(Arrays.toString(array2) + "->");
        sortUtils.bubble(array2);
        System.out.println(Arrays.toString(array2));

        System.out.print(Arrays.toString(array3) + "->");
        sortUtils.bubble(array3);
        System.out.println(Arrays.toString(array3));

        System.out.print(Arrays.toString(array4) + "->");
        sortUtils.bubble(array4);
        System.out.println(Arrays.toString(array4));

        System.out.print(Arrays.toString(array5) + "->");
        sortUtils.bubble(array5);
        System.out.println(Arrays.toString(array5));

        System.out.print(Arrays.toString(randomArray) + "->");
        sortUtils.bubble(randomArray);
        System.out.println(Arrays.toString(randomArray));

        System.out.print(Arrays.toString(consoleArray) + "->");
        sortUtils.bubble(consoleArray);
        System.out.println(Arrays.toString(consoleArray));
    }
}