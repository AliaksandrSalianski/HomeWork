package homeWork_2.loops;

import java.util.Scanner;

public class Loop3 {
    /**
     *  Метод возводит в степенью Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить,
     *  Второе число это степень в которую возводят первое число.
     *  Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
     */
    public static void exponentiation() {
        double result = 1;
        double number;
        int degree;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("wrong number");
            return;
        }
        System.out.println("enter degree");
        if (scanner.hasNextInt()) {
            degree = scanner.nextInt();
        } else {
            System.out.println("wrong degree");
            return;
        }
        if (degree < 0) {
            System.out.println("degree < 0");
            return;
        } else {
            for (int i = 1; i <= degree; i++) {
                result = result * number;
            }
        }
        System.out.println(number +" ^ "+ degree +" = "+result);
        scanner.close();
    }
}