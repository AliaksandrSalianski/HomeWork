package home_work_1;

import java.util.Scanner;

public class Task4Part3 {
    public static void checkDivisionTwoNumbers() {
        int numberOne;
        int numberTwo;
        System.out.println("Please, enter two integer numbers");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {//проверяем чтобы вводились int значения
            System.out.println("Invalid input");
        } else {
            numberOne = scanner.nextInt();
            System.out.printf("Number one = %d\n", numberOne);
            numberTwo = scanner.nextInt();
            System.out.printf("Number two = %d\n", numberTwo);
            if (numberTwo == 0) {
                System.out.println("The division operation is *NOT* possible.");
                System.out.println("<<division by zero>>");
            } else if (numberOne % numberTwo == 0) {
                System.out.printf("<<division WITHOUT remainder>>\n" +
                        "* remainder of the division = 0 \n" +
                        "* quotient in division = %d", numberOne / numberTwo);
            } else {
                double resultWithoutRounding = ((1.0 * numberOne) / numberTwo);//Без округления. Пример: 11 / 3 = 3.666666666665;
                double resultWithRounding = Math.round(resultWithoutRounding * 1000) / 1000.0;//Округление до трех знаков. Пример: 11/3 = 3.667;
                int quotient = numberOne / numberTwo;// Число(а) слева от запятой при делении,частное. Пример 5 / 2 = 2.5; quotient = 2;
                double remainder = (resultWithoutRounding - quotient);// Число(а) справа от  запятой при делении,остаток. Пример: 5/2 = 2.5; remainder = 0.5;
                System.out.println("<<division WITH remainder>>");
                System.out.println("* remainder of the division  = " + remainder);
                System.out.println("* quotient in division = " + quotient);
                System.out.println("* resultWithoutRounding = " + resultWithoutRounding);
                System.out.println("* resultWithRounding = " + resultWithRounding);
            }
        }
        scanner.close();
    }
}
