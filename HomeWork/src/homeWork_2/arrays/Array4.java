package homeWork_2.arrays;

public class Array4 {
    /**
     * метод считает при помощи цикла в массиве сумму четных положительных числел
     * и возвращает это значение
     */

    public static int sumOfEvenPositive(int[] array) {
        int result = 0;
        for (int n : array) {
            if (n % 2 == 0 && n > 0) {
                result += n;
            }
        }
        return result;
    }

    /**
     * Метод возвращает максимальный из элементов массива с четными индексами
     */
    public static int getMaxOfEven(int[] array) {
        int numberMax = array[0];
        for (int i = 2; i < array.length; i += 2) {
            if (array[i] > numberMax) {
                numberMax = array[i];
            }
        }
        return numberMax;
    }

    /**
     * Метод выводит элементы массива, которые меньше среднего арифметического
     */

    public static String printItemsBelowAverage(int[] array) {
        int summa = 0;
        int average;
        String result = "";
        for (int num : array) {
            summa += num;
        }
        average = summa / array.length;
        for (int num : array) {
            if (num < average) {
                result += num + " ";
            }
        }
        return result;
    }

    /**
     * Метод  выводит два  наименьших (минимальных) элемента массива
     */
    public static int[] printTwoMinInArray(int[] array) {
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
        return new int[]{maxOne, maxTwo};
    }

    /**
     * Метод сжимает массив, удалив из него все элементы, величина которых находится в интервале [min, max].
     * Освободившиеся в конце массива элементы заполнить нулями и возврощает сжатый массив
     */
    public static int[] deleteInInterval(int[] array, int min, int max) {
        int[] arrayWork = new int[array.length];
        int flagIndex = 0;
        for (int j : array) {
            if (j >= min && j <= max) {
                arrayWork[flagIndex] = j;
                flagIndex++;
            }
        }
        array = arrayWork;
        return array;
    }

    /**
     * Метод возврощает сумму всех цифр целочисленного массива.
     */
    public static int getSumOfAllDigits(int[] array) {
        int result = 0;
        StringBuilder str = new StringBuilder();
        for (int nb : array) {
            nb = nb > 0 ? nb : nb * (-1);
            str.append(nb);
        }
        char[] arrayOfChar = (str.toString()).toCharArray();
        for (char c : arrayOfChar) {
            result += Character.getNumericValue(c);
        }
        return result;
    }
}