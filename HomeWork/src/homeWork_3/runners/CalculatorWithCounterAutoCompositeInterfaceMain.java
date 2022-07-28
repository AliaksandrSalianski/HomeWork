package homeWork_3.runners;

import homeWork_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import homeWork_3.calcs.simple.CalculatorWithOperator;

/**
 * В классе высчитывается значение выражение при помощи экзепляра класса CalculatorWithCounterAutoAgregationInterface  и его методов.
 * В консоль выводится результат и количество вызова калькулятора
 */
public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        double division = calculator.giveDivision(28, 5);
        double degree = calculator.giveDegree(division, 2);
        double multi = calculator.giveMultiply(15, 7);
        double summa = calculator.giveSumma(multi, 4.1);
        double result = calculator.giveSumma(summa, degree);
        System.out.println("_____");
        System.out.println(result);
        System.out.println("count = " + calculator.getCountOperation());

    }

}
