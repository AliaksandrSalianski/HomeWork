package homeWork_2.loops;

public class Loop3 {
    /**
     * Метод возводит в степень. Первое число это число которое мы будем возводить,
     * Второе число это степень в которую возводят первое число.
     * Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным.
     */

    public  Double exponentiation(double number, int degree) {
        double result = 1;
        for (int i = 1; i <= degree; i++) {
            result = result * number;
        }
        return result;
    }
}
