package homeWork_2.arrays;

/**
 * Создать класс ArraysIteration. В этом клссе написать перебор массива при помощи do....while, while, for, foreach.
 * Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив. Все задачи в одном классе, в отдельных методах. Должно получиться 3 метода:
 * 1. Вывести все элементы в консоль.
 * 2. Вывести каждый второй элемент массива в консоль.
 * 3. Вывести все элементы массива в консоль в обратном порядке.
 */
public class ArraysIteration {


    public static void main(String[] args) {
        printEverySecond();
    }

    public static void printAllElements() {
        int[] array = ArraysUtils.arrayFromConsole();
        //do while
        int i = 0;
        do {
            System.out.print(array[i]);
            i++;
        } while (i < array.length);
        System.out.println("");
        //while
        i = 0;
        while (i < array.length) {
            System.out.print(array[i]);
            i++;
        }
        System.out.println();
        //for
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
        //foreach
        System.out.println("");
        for (int n : array) {
            System.out.print(n);
        }
    }

    public static void printEverySecond() {
        int[] array = ArraysUtils.arrayFromConsole();
        //do while
        int i = 0;
        do {
            System.out.print(array[i]);
            i += 2;
        } while (i < array.length);
        System.out.println("");
        //while
        i = 0;
        while (i < array.length) {
            System.out.print(array[i]);
            i += 2;
        }
        System.out.println();
        //for
        for (int j = 0; j < array.length; j += 2) {
            System.out.print(array[j]);
        }
        //foreach
        System.out.println("");
        int k = 0;
        for (int n : array) {
            if (k % 2 == 0) {
                System.out.print(n);
            }
            k += 1;
        }
    }
}