package homeWork_2.arrays;
/**
 * класс реализуе интерфейс IArrayOperation
 * реализует методы при помощи цикла For
 * метод printAllElements - печатает все элементы массива передонного в параметры
 * метод printEverySecond - печатает каждый второй элемент массива передонного в параметры
 * метод printReverse - печатает элементы массива передонного в параметры в обратном порядке
 */
public class ForOperation implements IArrayOperation {
    @Override
    public void printAllElements(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
    }

    @Override
    public void printEverySecond(int[] array) {
        for (int j = 0; j < array.length; j += 2) {
            System.out.print(array[j] + " ");
        }
    }

    @Override
    public void printReverse(int[] array) {
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
    }
}
