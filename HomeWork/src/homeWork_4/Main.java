package homeWork_4;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        DataComparatorHash dataContainerComparator = new DataComparatorHash();
        DataContainer<Integer> dataContainer = new DataContainer<>(new Integer[0]);
        System.out.println("dataContainer length before rates = " + dataContainer.getItems().length);
        System.out.println("add in dataContainer 6 in index " + dataContainer.add(6));
        System.out.println("add in dataContainer 99 in index " + dataContainer.add(99));
        System.out.println("add in dataContainer 3 in index " + dataContainer.add(3));
        System.out.println("add in dataContainer 10 in index " + dataContainer.add(10));
        System.out.println("add in dataContainer 7 in index " + dataContainer.add(7));
        System.out.println(dataContainer);
        System.out.println("element in index 0 = " + dataContainer.get(0));
        System.out.println("element in index 1 = " + dataContainer.get(1));
        System.out.println("element in index 2 = " + dataContainer.get(2));
        System.out.println("element in index 3 = " + dataContainer.get(3));
        System.out.println("element in index 4 = " + dataContainer.get(4));
        System.out.println("result delete operation by index 0 is " + dataContainer.delete(0));
        System.out.println("result delete operation by index 9 is " + dataContainer.delete(9));
        Integer one = 100;
        Integer two = 99;
        System.out.println("result delete operation element One is " + dataContainer.delete(one));
        System.out.println("result delete operation element Two is " + dataContainer.delete(two));
       // System.out.println(dataContainer.getItems().length);
        dataContainer.sort(dataContainerComparator);
        Integer[] arrayIntToTestSort = new Integer[]{10, 6, 5, 7, null, 1, 2, 3, 5, 4, 8, 9};
        String[] arrayStrToTestSort = new String[]{"C", "F", "E", "G","A", "K", "Y", "B", "D", "I", "X", "W", "M"};
        DataContainer<Integer> dataIntTestSort = new DataContainer<>(arrayIntToTestSort);
        DataContainer<String> dataStrTestSort = new DataContainer<>(arrayStrToTestSort);
        System.out.println("Before sort " + Arrays.toString(arrayIntToTestSort));
        DataContainer.sort(dataIntTestSort, dataContainerComparator);
        System.out.println("After sort " + Arrays.toString(arrayIntToTestSort));
        System.out.println("Before sort " + Arrays.toString(arrayStrToTestSort));
        DataContainer.sort(dataStrTestSort);
        System.out.println("After sort " + Arrays.toString(arrayStrToTestSort));

    }

}
