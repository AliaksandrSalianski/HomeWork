package homeWork_2.loops;

import java.security.SecureRandom;
import java.util.Scanner;

public class Loop6 {
    public static void main(String[] args) {
      fib();
    }

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
        int enterNumber = 0;
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
        System.out.println("Number =" + number);
        if(number == 0){
            System.out.println("0");
        }else if(number==1){
            System.out.println("1");
        }else {
            for (int i = 3; i <=number ; i++) {
                number = (i-2)+(i-1);
                System.out.println(number);
            }
        }
    }
}