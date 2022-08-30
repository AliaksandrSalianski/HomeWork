package home_work_1;

/**
 * В классе реализована проверка деления двух чисел. В случае деления без остатака возвращается частное, если деление без остатка невозможно возвращается остаток от деления.
 *
 */
public class Task4Part3 {
    public double checkDivisionOfTwoNumbers(double one, double two) {
        if (two == 0 && one > 0) {
            return Double.POSITIVE_INFINITY;
        } else if (two == 0 && one < 0) {
            return Double.NEGATIVE_INFINITY;
        } else if (one % two == 0) {
            return one / two;
        } else if (one % two != 0) {
            return (one / two - ((int) (one / two)));
        }
        return Double.NaN;
    }
}