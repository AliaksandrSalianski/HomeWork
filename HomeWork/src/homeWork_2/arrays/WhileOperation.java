package homeWork_2.arrays;

/**
 * класс реализуе интерфейс IArrayOperation
 * реализует методы при помощи цикла While
 * метод printAllElements - печатает все элементы массива передонного в параметры
 * метод printEverySecond - печатает каждый второй элемент массива передонного в параметры
 * метод printReverse - печатает элементы массива передонного в параметры в обратном порядке
 */
public class WhileOperation implements IArrayOperation {

    @Override
    public void printAllElements(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i]);
            i++;
        }
    }

    @Override
    public void printEverySecond(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i += 2;
        }
    }

    @Override
    public void printReverse(int[] array) {
        int i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
    }
}
