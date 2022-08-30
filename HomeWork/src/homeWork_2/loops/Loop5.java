package homeWork_2.loops;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Loop5 {
    /**
     * Метод находит наибольшую цифру натурального числа.Вводится только целочисленное число .
     * Число переводится в массив char, первоночалньное значение max - это элеменнт в нулевой ячейки. Поэлементно сравнивается  при помощи цикла с каждым значением в массиве.
     * Максимальное значение сохраняется в переменную max
     */

    public int findMaxNumber(int enterNumber) {
        String foo = enterNumber + "";
        char[] array = foo.toCharArray();
        int max = 0;
        max = Character.getNumericValue(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (Character.getNumericValue(array[i]) > max) {
                max = Character.getNumericValue(array[i]);
            }
        }
        return max;
    }


    /**
     * Метод выводит процент четных случайных чисел из количества введенного пользователем через Scanner.Консоль принимает только
     * целочисленные значения, в случае ошибки выводится сообщение о неверном вводе.
     */

    public static void randomCheck() {
        System.out.println("enter the number of random numbers");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("wrong input");
        } else {
            int countEnter = scanner.nextInt();
            int result = 0;
            Random random = new Random();
            int count = countEnter;
            while (count != 0) {
                int randomInt = random.nextInt();
                if (randomInt % 2 == 0) {
                    result++;
                }
                count--;
            }
            int percentageResult = (int) (result * 1.0 / countEnter * 100);
            System.out.printf("Probability of getting even numbers = %d%% during generation %d random numbers", percentageResult, countEnter);
        }
        scanner.close();
    }

    /**
     * Метод считает четные и нечетные цифры числа путем представления числа в виде массива char и прохождением по массиву циклом.
     * Количество четных  переменная "eventCount"
     * Количество нечетных  переменная "oddCount"
     */

    public int[] countEvenAndOdd(int number) {
        int eventCount = 0;
        int oddCount = 0;
        String foo = number + "";
        char[] arrayOfChar = foo.toCharArray();
        for (char c : arrayOfChar) {
            if (Character.getNumericValue(c) % 2 == 0) {
                eventCount++;
            } else {
                oddCount++;
            }
        }
        return new int[]{eventCount, oddCount};
    }


    /**
     * метод принимает от пользователя только целое число
     * в консоль выводятся числа Фибоначи количеством введенного значения пользователем.При помощи масссива и цикла.
     */

    public long[] fibWithArray(int number) {
        long[] result;
        if (number == 0) {
            return new long[number];
        } else if (number == 1) {
            return new long[]{1};
        } else {
            long[] arrayFib = new long[number];
            arrayFib[0] = 1;
            arrayFib[1] = 2;
            for (int j = 2; j <= arrayFib.length - 1; j++) {
                arrayFib[j] = arrayFib[j - 1] + arrayFib[j - 2];

            }
            result = arrayFib;
        }
        return result;
    }


    /**
     * метод принимает от пользователя только целое число в случае неверного ввогда выводится сообщение об ошибки.
     * в консоль выводятся числа Фибоначи количеством введенного значения пользователем. При помощи только цикла.
     */

    public static String fibWithFor() {
        String result = "Fib :";
        int number = 0;
        System.out.println("Enter integer number");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Wrong input number < 0 ");
                return result;
            }
            System.out.println("Number = " + number);
            int numberOne = 0;
            int numberTwo = 1;
            int helper = 0;
            switch (number) {
                case (0):
                    return result;
                case (1):
                    return result + number;
                default:
                    for (int i = 0; i < (number); i++) {
                        helper = numberTwo + numberOne;
                        numberOne = numberTwo;
                        numberTwo = helper;
                        result += helper + " ";
                    }
            }
            scanner.close();
        }
        return result;
    }

    /**
     * Метод возврощает ряд натуральных чисел от min до max c шагом step при помощи цикла. Все значения
     * переменных целочисленные
     */

    public String stepOutput(int min, int max, int step) {
        StringBuilder result = new StringBuilder();
        for (int i = min; i <= max; i += step) {
            result.append(i).append(" ");
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Loop5 loop5 = new Loop5();
        System.out.println(loop5.stepOutput(1, 10, 2));
    }
    /**
     * метод формирует из введенного обратное по порядку входящих в него цифр и выводит на экран.
     * Введенное число только целочисленное
     */

    public  String numberFlip(int number) {
        StringBuilder reversStr = new StringBuilder();
        String str = Integer.toString(number);
        char[] arrayOfChar = str.toCharArray();
        for (int i = arrayOfChar.length - 1; i >= 0; i--) {
            reversStr.append(arrayOfChar[i]);
        }
        return reversStr.toString();
    }
}



