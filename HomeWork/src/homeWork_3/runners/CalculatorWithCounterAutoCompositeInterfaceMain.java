package homeWork_3.runners;

import homeWork_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import homeWork_3.calcs.simple.CalculatorWithOperator;
import homeWork_3.calcs.simple.Print;

/**
 * В классе высчитывается значение выражение при помощи экзепляра класса CalculatorWithCounterAutoAgregationInterface  и его методов.
 * В консоль выводится результат и количество вызова калькулятора
 */
public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Print.printWithICalculator(calculator);
        System.out.println("count = " + calculator.getCountOperation());
    }

}
