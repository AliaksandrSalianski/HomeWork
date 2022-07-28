package homeWork_3.runners;

import homeWork_3.calcs.simple.CalculatorWithMathExtends;
import homeWork_3.calcs.simple.CalculatorWithOperator;

/**
 * В классе высчитывается значение выражение при помощи экзепляра класса CalculatorWithOperator и его методов.
 * В консоль выводится результат.
 */
public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithOperator calMathExtends = new CalculatorWithMathExtends();
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        double division = calMathExtends.giveDivision(28, 5);
        double degree = calMathExtends.giveDegree(division, 2);
        double multi = calMathExtends.giveMultiply(15, 7);
        double summa = calMathExtends.giveSumma(multi, 4.1);
        double result = calMathExtends.giveSumma(summa, degree);
        System.out.println("_____");
        System.out.println(result);
    }
}

