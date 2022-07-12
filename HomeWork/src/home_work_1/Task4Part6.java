package home_work_1;

import java.util.Scanner;

public class Task4Part6 {
    public static void leapYear() {
        Scanner scanner = new Scanner(System.in);
        int enterYear;
        if (scanner.hasNextInt()) {
            enterYear = scanner.nextInt();
            if ((enterYear % 4 == 0 && enterYear % 100 != 0) || (enterYear % 400 == 0)) {
                System.out.println("the year is high");
            } else {
                System.out.println("year is not high");
            }
        } else {
            System.out.println("entered not a number");
        }
    }
}
