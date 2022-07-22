package homeWork_2.arrays;

public class ForEachOperation implements IArrayOperation {
    @Override
    public void printAllElements(int[] array) {
        System.out.println("");
        for (int n : array) {
            System.out.print(n);
        }
    }

    @Override
    public void printEverySecond(int[] array) {
        int k = 0;
        for (int n : array) {
            if (k % 2 == 0) {
                System.out.print(n + " ");
            }
            k += 1;
        }
    }

    @Override
    public void printReverse(int[] array) {
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