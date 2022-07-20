package homeWork_2.loops;

public class Loop4 {
    /**
     * Метод умножает число long a = 1; пока не произойдёт переполнение. В конце в консоль выводится сообщение со значением до переполнения и после переполнения. Умножается на интервал от
     * [-Integer.Min_Value;Integer.Max_Value] путем добавления рандомно знака "-".
     */
    public static void multiplyToOverflow() {
        long a = 1;
        long previousValueA = 1;
        while (true) {
            int sing = Math.random() < 0.5 ? -1 : 1;
            int random = (int) (Math.random() * Integer.MAX_VALUE) * sing;
            random = random == -Integer.MAX_VALUE ? random - 1 : random;
            a *= random;
            if ((previousValueA > 0 && random > 0 || previousValueA < 0 && random < 0) && a < 0) {
                System.out.println("overflow");
                System.out.println("before overflow =" + previousValueA);
                System.out.println("after overflow =" + a);
                break;
            } else if ((previousValueA < 0 && random > 0 || previousValueA > 0 && random < 0) && a > 0) {
                System.out.println("overflow");
                System.out.println("before overflow =" + previousValueA);
                System.out.println("after overflow =" + a);
                break;
            }
            previousValueA = a;
        }
    }
}