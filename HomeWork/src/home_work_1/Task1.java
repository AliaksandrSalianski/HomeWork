package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void doBitwiseOperations() {
        Scanner scanner = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        System.out.println("Please, enter two numbers");
        if (scanner.hasNextInt()) {
            numberOne = scanner.nextInt();
            System.out.printf("NumberOne = %d\n", numberOne);
            numberTwo = scanner.nextInt();
            System.out.printf("NumberTwo = %d\n", numberTwo);
            System.out.printf("Result of operation \"|\" = %d\n", numberOne | numberTwo);
            /* example
                      00101010  42
                    | 00001111  15
                    --------------
                      00101111  47
            */
            System.out.printf("Result of operation \"&\" = %d\n", numberOne & numberTwo);
            /* example
                      00101010  42
                    & 00001111  15
                    --------------
                      00001010  10
            */
        } else {
            //Bitwise operations only work on integer variables.
            //It is not possible to perform an operation with the number 42.5
            System.out.println("Sorry, entered NOT a number or a FLOATING POINT number ");
        }
        scanner.close();
    }
}
