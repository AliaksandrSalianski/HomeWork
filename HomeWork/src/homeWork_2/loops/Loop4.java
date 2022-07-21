package homeWork_2.loops;

import java.util.Random;

public class Loop4 {
    /**
     * Метод умножает число long a = 1 на рандомное число пока не произойдёт переполнение.
     * В конце в консоль выводится сообщение со значением до переполнения и после переполнения.
     */
    public static void main(String[] args) {
        multiplyToOverflow();
    }
    public static void multiplyToOverflow() {
        long a = 1;
        long previousValueA = 1;
        Random random = new Random();
        while (true) {
            int randomInt = random.nextInt() ;
            a *= randomInt;
            if ((previousValueA > 0 && randomInt > 0 || previousValueA < 0 && randomInt < 0) && a < 0) {
                System.out.println("overflow");
                System.out.println("before overflow =" + previousValueA);
                System.out.println("after overflow =" + a);
                break;
            } else if ((previousValueA < 0 && randomInt > 0 || previousValueA > 0 && randomInt < 0) && a > 0) {
                System.out.println("overflow");
                System.out.println("before overflow =" + previousValueA);
                System.out.println("after overflow =" + a);
                break;
            }
            previousValueA = a;
        }
    }
}