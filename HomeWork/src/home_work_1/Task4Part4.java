package home_work_1;

import java.util.Scanner;

//4.4 Перевести байты в килобайты или наоборот
public class Task4Part4 {

    public static void converting() {
        System.out.println("Please, enter integer number");
        Scanner scanner = new Scanner(System.in);
        int enterNumber;
        if (scanner.hasNextInt()) {
            enterNumber = scanner.nextInt();
            if (enterNumber < 0) {
                System.out.println("your number < 0");
            } else {
                System.out.println("Enter number \"1\" bytes => kilobytes");
                System.out.println("Enter number \"2\" kilobytes => bytes");
                System.out.println("Enter number \"0\" to cancel");
                int choice;
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    switch (choice) {
                        case (1):
                            System.out.printf("%d bytes => %f kilobytes", enterNumber, enterNumber * 1.0 / 1024);
                            break;
                        case (2):
                            System.out.printf("%d kilobytes => %d bytes", enterNumber, enterNumber * 1024);
                            break;
                        case (0):
                            System.out.println("Cancel operation");
                            break;
                        default:
                            System.out.println("you need to enter : \"1\" \"2\" or \"0\"");
                            converting();
                            break;
                    }
                } else {
                    System.out.println("Sorry, invalid parameter");
                }
            }
        } else {
            System.out.println("Sorry, invalid parameter");
        }
        scanner.close();
    }
}