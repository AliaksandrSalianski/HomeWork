package homeWork_2.loops;

import java.util.Random;

public class Loop4 {
    /**
     * Метод умножает число long a = 1 на рандомное число пока не произойдёт переполнение.
     * В конце в консоль выводится сообщение со значением до переполнения и после переполнения.
     */
    public static String multiplyToOverflow() {
        String strResult = "";
        long a = 1;
        long previousValueA = 1;
        Random random = new Random();
        while (true) {
            int randomInt = random.nextInt();
            a *= randomInt;
            strResult = "overflow\n \tbefore overflow = " + previousValueA + "\n\tafter overflow = " + a;
            if ((previousValueA > 0 && randomInt > 0 || previousValueA < 0 && randomInt < 0) && a < 0) {
                return strResult;
            } else if ((previousValueA < 0 && randomInt > 0 || previousValueA > 0 && randomInt < 0) && a > 0) {
                return strResult;
            }
            previousValueA = a;
        }
    }

}