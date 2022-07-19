package homeWork_2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtils {
    /**
     * Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
     */
    public static int[] arrayFromConsole() {
        int size;
        int[] array;
        System.out.println("enter size of array");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("wrong input");
            System.out.println("return empty array with size 0");
            scanner.close();
            return array = new int[0];
        }
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter number in position " + i);
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
                System.out.println("in position " + i + " number= " + array[i]);
            } else {
                System.out.println("Wrong input in position " + i);
                System.out.println("return array with 0 from position " + i);
                scanner.close();
                return array;
            }
        }
        scanner.close();
        return array;
    }

    /**
     * Данный метод принимает два аргумента. Первый (size) указывает размер
     * массива который мы хотим получить. Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int sing = Math.random() < 0.5 ? -1 : 1;
            array[i] = (int) (Math.random() * maxValueExclusion) * sing;
        }
        return array;
    }
}