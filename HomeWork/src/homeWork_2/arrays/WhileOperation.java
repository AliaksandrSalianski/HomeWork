package homeWork_2.arrays;

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
