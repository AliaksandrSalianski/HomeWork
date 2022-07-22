package homeWork_2.arrays;

public class DoWhileOperation implements IArrayOperation {

    public void printAllElements(int[] array) {
        array = Array1ArraysUtils.arrayFromConsole();
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

    public static void main(String[] args) {
        DoWhileOperation one = new DoWhileOperation();

    }
}
