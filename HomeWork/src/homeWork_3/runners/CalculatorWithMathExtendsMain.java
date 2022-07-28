package homeWork_3.runners;

import homeWork_3.calcs.simple.CalculatorWithMathExtends;
import homeWork_3.calcs.simple.CalculatorWithOperator;
import homeWork_3.calcs.simple.Print;

/**
 * В классе высчитывается значение выражение при помощи экзепляра класса CalculatorWithOperator и его методов.
 * В консоль выводится результат.
 */
public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithOperator calMathExtends = new CalculatorWithMathExtends();
        Print.printWithICalculator(calMathExtends);
    }
}

