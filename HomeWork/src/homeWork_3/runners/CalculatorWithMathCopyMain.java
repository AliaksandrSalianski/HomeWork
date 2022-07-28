package homeWork_3.runners;

import homeWork_3.calcs.simple.CalculatorWithMathCopy;
import homeWork_3.calcs.simple.Print;

/**
 * В классе высчитывается значение выражение при помощи экзепляра класса CalculatorWithMathCopy  и его методов.
 * В консоль выводится результат.
 */
public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calMathCopy = new CalculatorWithMathCopy();
        Print.printWithICalculator(calMathCopy);
    }
}

