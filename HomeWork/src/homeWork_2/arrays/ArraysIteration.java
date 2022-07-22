package homeWork_2.arrays;


import homeWork_2.utils.ArraysUtils;

public class ArraysIteration {
    /**пше
     * Метод печатает все элементы массива при помощи
     * do....while, while, for, foreach.
     */

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

    /**
     * Метод печатает каждый второй элемент массива при помощи
     * do....while, while, for, foreach.
     */

    public static void printEverySecond() {
        int[] array = ArraysUtils.arrayFromConsole();
        //do while
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i += 2;
        } while (i < array.length);
        System.out.println("");
        //while
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i += 2;
        }
        System.out.println();
        //for
        for (int j = 0; j < array.length; j += 2) {
            System.out.print(array[j] + " ");
        }
        //foreach
        System.out.println("");
        int k = 0;
        for (int n : array) {
            if (k % 2 == 0) {
                System.out.print(n + " ");
            }
            k += 1;
        }
    }

    /**
     * Метод печатает массив в обратном порядке при помощи
     * do....while, while, for, foreach.
     */
    git
    public static void printReverse() {
        int[] array = ArraysUtils.arrayFromConsole();
        //do while
        int i = array.length - 1;
        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println("");
        //while
        i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
        System.out.println();
        //for
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
        System.out.println("");
        //foreach
        int[] arrayRevere = new int[array.length];
        int a = array.length - 1;
        for (int j = 0; j < arrayRevere.length; j++) {
            arrayRevere[j] = array[a];
            a--;
        }
        for (int n : arrayRevere) {
            System.out.print(n + " ");
        }
    }
}