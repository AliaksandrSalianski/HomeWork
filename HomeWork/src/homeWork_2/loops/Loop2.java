package homeWork_2.loops;

import java.util.Scanner;

/** Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
 *  Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
 */

public class Loop2 {

    public static void printMultiplication() {
        int number;
        int result = 1;
        System.out.println("Please, enter integer number ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else if (scanner.hasNextDouble()) {
            System.out.println("Введено не целое число");
            return;
        } else {
            System.out.println("Введено не число");
            return;
        }
        String str = "" + number;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int charToNumber = Character.digit(charArray[i], 10);
            result *= charToNumber;
            String multiplyOrEquals = i == charArray.length - 1 ? "=" + result : "*";
            System.out.print(charArray[i] + multiplyOrEquals);

        }

    }
}


