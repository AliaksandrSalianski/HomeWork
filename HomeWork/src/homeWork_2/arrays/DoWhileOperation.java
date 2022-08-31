package homeWork_2.arrays;

import homeWork_2.utils.ArraysUtils;

/**
 * класс реализуе интерфейс IArrayOperation
 * реализует методы при помощи цикла DoWhile
 * метод printAllElements - печатает все элементы массива передонного в параметры
 * метод printEverySecond - печатает каждый второй элемент массива передонного в параметры
 * метод printReverse - печатает элементы массива передонного в параметры в обратном порядке
 */
public class DoWhileOperation implements IArrayOperation {

    public void printAllElements(int[] array) {
        array = ArraysUtils.arrayFromConsole();
        int i = 0;
        do {
            System.out.print(array[i]);
            i++;
        } while (i < array.length);
        System.out.println("");
    }

    @Override
    public void printEverySecond(int[] array) {
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i += 2;
        } while (i < array.length);
        System.out.println("");
    }

    @Override
    public void printReverse(int[] array) {
        int i = array.length - 1;
        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println("");
    }

}
