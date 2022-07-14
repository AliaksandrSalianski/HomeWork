package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task6Part2 {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLong() || scanner.hasNextFloat()) {
            System.out.println("wrong input");
        } else {
            String name = scanner.nextLine();
            if (Objects.equals(name, "Вася")) {
                System.out.println("Привет!");
            } else if (Objects.equals(name, "Анастасия")) {
                System.out.print("Я тебя так долго ждал");
            } else if (!Objects.equals(name, "Вася") && !Objects.equals(name, "Анастасия")) {
                System.out.println("Добрый день, а вы кто?");
            }
        }
        scanner.close();
    }
}