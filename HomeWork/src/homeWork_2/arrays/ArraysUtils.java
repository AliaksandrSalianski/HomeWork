package homeWork_2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtils {
    /**
     * Создать класс ArraysUtils. В этом классе написать следующие методы:
     * 2.1.1. Написать метод public static int[] arrayFromConsole(). Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
     * 2.1.1.1. Пример в отдельном классе с main. int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole будет запрошена информация у пользователя, пользователь вводит
     * размер (3) и его элементы по порядку {4, 17, 32}. Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.
     * 2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion). Данный метод принимает два аргумента. Первый (size) указывает размер
     * массива который мы хотим получить. Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
     * 2.1.2.1. Пример в отдельном классе с main. int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom будет создан массив размером 5 с числами от 0 до 99
     * (использовать класс Random) и сохранён в переменную container.
     */
    public static void main(String[] args) {
        int [] array2 =arrayFromConsole();
        System.out.println(Arrays.toString(array2));
    }

    public static int[] arrayFromConsole() {
        int size;
        int[] array;
        System.out.println("enter size of array");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("wrong input");
            System.out.println("return empty array with size 0");
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
                return array;
            }
        }
        return array;
    }
}