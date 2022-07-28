package homeWork_3.runners;

import homeWork_3.calcs.additional.CalculatorWithCounterAutoSuper;
import homeWork_3.calcs.simple.Print;

/**
 * В классе высчитывается значение выражение при помощи экзепляра класса CalculatorWithCounterAutoSuper  и его методов.
 * В консоль выводится результат и количество вызова калькулятора
 */
public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calAutoSuper = new CalculatorWithCounterAutoSuper();
        Print.printWithICalculator(calAutoSuper);
        System.out.println("count = " + calAutoSuper.getCountOperation());
    }
}
