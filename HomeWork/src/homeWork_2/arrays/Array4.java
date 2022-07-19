package homeWork_2.arrays;

import java.util.Arrays;

public class Array4 {

    /**
     * 2.4.1. Сумма четных положительных элементов массива
     * 2.4.2. Максимальный из элементов массива с четными индексами
     * 2.4.3. Элементы массива, которые меньше среднего арифметического
     * 2.4.4. Найти два наименьших (минимальных) элемента массива
     * 2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
     * 2.4.6. Сумма цифр массива
     */
    public static void main(String[] args) {
        int [] array =ArraysUtils.arrayRandom(50, 100);
        System.out.println(sumOfEvenPositive(array));
    }
    public static int sumOfEvenPositive(int [] array) {
        int result = 0;
        for (int n : array) {
            if (n % 2 == 0 && n > 0) {
                result += n;
            }
        }
        return result;
    }
}