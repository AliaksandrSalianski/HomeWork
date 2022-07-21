package homeWork_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Loop5 {
    /**
     * Метод находит наибольшую цифру натурального числа полученную через Scanner.Вводится только целочисленное число в случае неверного ввода пишется сообщение.
     * Число переводится в массив char, первоночалньное значение max - это элеменнт в нулевой ячейки. Поэлементно сравнивается  при помощи цикла с каждым значением в массиве.
     * Максимальное значение сохраняется в переменную max
     */

    public static void findMaxNumber() {
        int enterNumber = 0;
        System.out.println("Enter integer number");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            enterNumber = scanner.nextInt();
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
     * Метод принимает через Scanner  только целые числа в случае неверного ввода выдается ошибка.
     * Метод считает четные и нечетные цифры числа путем представления числа в виде массива char и прохождением по массиву циклом.
     * Количество четных  переменная "eventCount"
     * Количество нечетных  переменная "oddCount"
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
            System.out.printf("In number %d \nevent = %d\n  \rodd =%d\t", enterNumber, eventCount, oddCount);
            scanner.close();
        }
    }

    /**
     * метод принимает от пользователя только целое число в случае неверного ввогда выводится сообщение об ошибки.
     * в консоль выводятся числа Фибоначи количеством введенного значения пользователем.При помощи масссива и цикла.
     */
    public static void fibWithArray() {
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
     * метод принимает от пользователя только целое число в случае неверного ввогда выводится сообщение об ошибки.
     * в консоль выводятся числа Фибоначи количеством введенного значения пользователем. При помощи только цикла.
     */
    public static void fibWithFor() {
        int number = 0;
        System.out.println("Enter integer number");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            number = scanner.nextInt();
            System.out.println("Number = " + number);
            int numberOne = 1;
            int numberTwo = 1;
            int helper = 0;
            System.out.print(numberTwo + " ");
            for (int i = 0; i < (number - 1); i++) {
                helper = numberTwo + numberOne;
                numberOne = numberTwo;
                numberTwo = helper;
                System.out.print(helper + " ");
            }
            scanner.close();
        }
    }

    /**
     * Метод выводит в консоль ряд натуральных чисел от min до max c шагом step при помощи цикла. Все значения
     * переменных целочисленные и
     * вводятся через Scanner.В случае неверного ввода выводится сообщение.
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
     * метод формирует из введенного числа через Scanner обратное по порядку входящих в него цифр и выводит на экран.
     * Введенное число только целочисленное в случае ошибки выводится сообщение.Число преобразуется в массив и обратным
     * циклом выводятся элементы на экран
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



