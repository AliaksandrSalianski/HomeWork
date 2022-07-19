package homeWork_2.arrays;

import java.util.Arrays;

public class Array4 {

    /**
     * 1. Сумма четных положительных элементов массива
     * 2. Максимальный из элементов массива с четными индексами
     * 3. Элементы массива, которые меньше среднего арифметического
     * 4. Найти два наименьших (минимальных) элемента массива
     * 5. Сжать массив, удалив элементы, принадлежащие интервалу
     * 2.4.6. Сумма цифр массива
     */
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayRandom(3, 100);
        printTwoMinInArray(array);
    }

    //1
    public static int sumOfEvenPositive(int[] array) {
        int result = 0;
        for (int n : array) {
            if (n % 2 == 0 && n > 0) {
                result += n;
            }
        }
        return result;
    }

    //2
    public static int getMaxOfEven(int[] array) {
        int numberMax = array[0];
        for (int i = 2; i < array.length; i += 2) {
            if (array[i] > numberMax) {
                numberMax = array[i];
            }
        }
        return numberMax;
    }

    //3
    public static void printItemsBelowAverage(int[] array) {
        int summa = 0;
        int average;
        StringBuilder result = new StringBuilder();
        for (int num : array) {
            summa += num;
        }
        average = summa / array.length;
        for (int num : array) {
            if (num < average) {
                result.append(num).append(" ");
            }
        }
        System.out.println("Average = " + average);
        System.out.println("Items below average is : ");
        System.out.println(result);
    }

    //4
    public static void printTwoMinInArray(int[] array) {
        int maxOne = Integer.MIN_VALUE;
        int maxTwo = Integer.MIN_VALUE;
        for (int nb : array) {
            if (maxOne < nb) {
                maxTwo = maxOne;
                maxOne = nb;
            } else if (maxOne > nb && maxTwo < nb) {
                maxTwo = nb;
            }
        }
        System.out.println("Max first = " + maxOne);
        System.out.println("Max second = " + maxTwo);
    }

    //5

}