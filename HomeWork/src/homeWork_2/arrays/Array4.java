package homeWork_2.arrays;

public class Array4 {
    /**
     * метод считает при помощи цикла в массиве сумму четных положительных числел
     * и возвращает это значение
     */

    public  int sumOfEvenPositive(int[] array) {
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
    public  int getMaxOfEven(int[] array) {
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

    public  String printItemsBelowAverage(int[] array) {
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
        return result.toString();
    }

    /**
     * Метод  выводит два  наименьших (минимальных) элемента массива
     */
    public  int[] printTwoMinInArray(int[] array) {
        int maxOne = Integer.MAX_VALUE;
        int maxTwo = Integer.MAX_VALUE;
        for (int nb : array) {
            if (maxOne > nb) {
                maxTwo = maxOne;
                maxOne = nb;
            } else if (maxOne < nb && maxTwo > nb) {
                maxTwo = nb;
            }
        }
        return new int[]{maxOne, maxTwo};
    }


    /**
     * Метод сжимает массив, удалив из него все элементы, величина которых находится в интервале [min, max].
     * Освободившиеся в конце массива элементы заполнить нулями и возврощает сжатый массив
     */
    public  int[] deleteInInterval(int[] array, int min, int max) {
        int[] arrayWork = new int[array.length];
        int flagIndex = 0;
        for (int j : array) {
            if (!(j >= min && j <= max)) {
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
    public  int getSumOfAllDigits(int[] array) {
        int result = 0;
        for (int c : array) {
            result += c;
        }
        return result;
    }

}