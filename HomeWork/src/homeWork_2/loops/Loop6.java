package homeWork_2.loops;

import java.security.SecureRandom;
import java.util.Scanner;

public class Loop6 {
    public static void main(String[] args) {
randomCheck();
    }

    public static void findMaxNumber() {
        int enterNumber = 0;
        System.out.println("Enter integer number");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            enterNumber = scanner.nextInt();
        }
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
    }

    public static void randomCheck() {
        int result = 0;
        int min = 1;
        int max = Integer.MAX_VALUE;
        int count = 1000;
        while (count != 0) {
            int random = new SecureRandom().nextInt(max - min)+min;
            if (random % 2 == 0) {
                result++;
            }
            count--;
        }
        System.out.printf("the number of even random numbers from 1000 = %d",result);
    }
}
