package homeWork_3.runners;

import homeWork_3.calcs.simple.CalculatorWithOperator;
import homeWork_3.calcs.simple.Print;

/**
 * В классе высчитывается значение выражения при помощи экзепляра класса CalculatorWithOperator и его методов.
 * В консоль выводится результат
 *
 */
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calOne = new CalculatorWithOperator();
        Print.printWithICalculator(calOne);

    }
}
