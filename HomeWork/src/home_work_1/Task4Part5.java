package home_work_1;

import java.util.Scanner;

public class Task4Part5 {
    public static void defineEngChar() {
        System.out.println("Enter integer number ");
        Scanner scanner = new Scanner(System.in);
        int enterNumber = 0;
        if (scanner.hasNextInt()) {
            enterNumber = scanner.nextInt();
        } else {
            System.out.println("wrong,entered not a number ");
            return;
        }
        if ((enterNumber >= 65 && enterNumber <= 90) || (enterNumber >= 97 && enterNumber <= 122)) {
            System.out.print("Yes, this is the english code");
        } else {
            System.out.println("No,this is not english code");
        }
        scanner.close();
    }
}