package homeWork_2.loops;

import java.security.SecureRandom;
import java.util.Scanner;

public class Loop5 {
    /**
     * Найти наибольшую цифру натурального числа
     */
    public static void findMaxNumber() {
        int enterNumber = 0;
        System.out.println("Enter integer number");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            enterNumber = scanner.nextInt();
        }
        String str = enterNumber + "";
        char[] array = str.toCharArray();
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            max = Character.getNumericValue(array[0]);
            if (Character.getNumericValue(array[i]) > max) {
                max = Character.getNumericValue(array[i]);
            }
        }
        System.out.printf("Max number in %d = %d", enterNumber, max);
        scanner.close();
    }

    /**
     * Вероятность четных случайных чисел
     */
    public static void randomCheck() {
        int result = 0;
        int min = 1;
        int max = Integer.MAX_VALUE;
        int count = 1000;
        while (count != 0) {
            int random = new SecureRandom().nextInt(max - min) + min;
            if (random % 2 == 0) {
                result++;
            }
            count--;
        }
        System.out.printf("the number of even random numbers from 1000 = %d", result);
    }

    /**
     * Посчитать четные и нечетные цифры числа
     */
    public static void countEvenAndOdd() {
        int eventCount = 0;
        int oddCount = 0;
        int enterNumber;
        System.out.println("Enter number integer");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("wrong input");
        } else {
            enterNumber = scanner.nextInt();
            String str = enterNumber + "";
            char[] arrayOfChar = str.toCharArray();
            for (char c : arrayOfChar) {
                if (Character.getNumericValue(c) % 2 == 0) {
                    eventCount++;
                } else {
                    oddCount++;
                }
            }
            System.out.printf("In number %d event = %d  odd =%d", enterNumber, eventCount, oddCount);
            scanner.close();
        }
    }

    /**
     * фибоначи
     */
    public static void fib() {
        System.out.println("Enter integer number");
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            number = scanner.nextInt();
        }
        System.out.println("Number = " + number);
        if (number == 0) {
            System.out.println("0");
        } else if (number == 1) {
            System.out.println("1");
        } else {
            long[] arrayFib = new long[number + 2];
            arrayFib[0] = 0;
            arrayFib[1] = 1;
            for (int j = 2; j <= arrayFib.length - 1; j++) {
                arrayFib[j] = arrayFib[j - 1] + arrayFib[j - 2];
                System.out.print(arrayFib[j] + " ");
            }
            scanner.close();
        }
    }

    /**
     * Вывести ряд чисел в диапазоне с шагом
     */
    public static void stepOutput() {
        int max;
        int min;
        int step;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max");
        if (scanner.hasNextInt()) {
            max = scanner.nextInt();
        } else {
            System.out.println("wrong max input");
            return;
        }
        System.out.println("Enter min");
        if (scanner.hasNextInt()) {
            min = scanner.nextInt();
        } else {
            System.out.println("wrong min input");
            return;
        }
        System.out.println("Enter step");
        if (scanner.hasNextInt()) {
            step = scanner.nextInt();
        } else {
            System.out.println("wrong step input");
            return;
        }
        for (int i = min; i <= max; i += step) {
            System.out.print(i + " ");
        }
        scanner.close();
    }

    /**
     * выводит число в обратном порядке
     */
    public static void numberFlip() {
        System.out.println("Enter integer number");
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            number = scanner.nextInt();
        }
        String str = Integer.toString(number);
        char[] arrayOfChar = str.toCharArray();
        for (int i = arrayOfChar.length - 1; i >= 0; i--) {
            System.out.print(arrayOfChar[i]);
        }
        scanner.close();
    }
}



