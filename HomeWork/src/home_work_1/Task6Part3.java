package home_work_1;

import java.util.Scanner;

public class Task6Part3 {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLong() || scanner.hasNextFloat()) {
            System.out.println("wrong input");
        } else {
            String name = scanner.nextLine();
            switch (name) {
                case ("Вася"):
                    System.out.println("Привет!");
                    break;
                case ("Анастасия"):
                    System.out.print("Я тебя так долго ждал");
                    break;
                default:
                    System.out.println("Добрый день, а вы кто?");
            }
        }
        scanner.close();
    }
}

