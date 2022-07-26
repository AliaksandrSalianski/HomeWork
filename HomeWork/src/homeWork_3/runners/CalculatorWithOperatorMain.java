package homeWork_3.runners;

import homeWork_3.calcs.simple.CalculatorWithOperator;

/**
 * В клаасе создан обьект класса CalculatorWithOperator
 * при помощи обькта calOne и методов высчитывается значение выражения и результат выводится в консоль
 *
 */
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        CalculatorWithOperator calOne = new CalculatorWithOperator();
        double division = calOne.giveDivision(28, 5);
        double degree = calOne.giveDegree(division, 2);
        double multi = calOne.giveMultiply(15, 7);
        double summa = calOne.giveSumma(multi, 4.1);
        double result = calOne.giveSumma(summa, degree);
        System.out.println("_____");
        System.out.println(result);

    }
}
