package homeWork_3.runners;

import homeWork_3.calcs.additional.CalculatorWithCounterAutoSuper;

/**
 * В классе высчитывается значение выражение при помощи экзепляра класса CalculatorWithCounterAutoSuper  и его методов.
 * В консоль выводится результат и количество вызова калькулятора
 */
public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        CalculatorWithCounterAutoSuper calAutoSuper = new CalculatorWithCounterAutoSuper();
        double division = calAutoSuper.giveDivision(28, 5);
        double degree = calAutoSuper.giveDegree(division, 2);
        double multi = calAutoSuper.giveMultiply(15, 7);
        double summa = calAutoSuper.giveSumma(multi, 4.1);
        double result = calAutoSuper.giveSumma(summa, degree);
        System.out.println("_____");
        System.out.println(result);
        System.out.println("count = "+ calAutoSuper.getCountOperation());
    }
}
