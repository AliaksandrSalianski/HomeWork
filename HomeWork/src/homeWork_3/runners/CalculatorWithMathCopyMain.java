package homeWork_3.runners;

import homeWork_3.calcs.simple.CalculatorWithMathCopy;

/**
 * В клаасе создан обьект класса CalculatorWithMathCopy
 * при помощи обькта calMathCop и методов высчитывается значение выражения и результат выводится в консоль
 */
public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        CalculatorWithMathCopy calMathCopy = new CalculatorWithMathCopy();
        double division = calMathCopy.giveDivision(28, 5);//(28 / 5)
        double degree = calMathCopy.giveDegree(division, 2);//(28 / 5) ^ 2
        double multi = calMathCopy.giveMultiply(15, 7);//15 * 7
        double summa = calMathCopy.giveSumma(multi, 4.1);//4.1 + 15 * 7
        double result = calMathCopy.giveSumma(summa, degree);//4.1 + 15 * 7 + (28 / 5) ^ 2
        System.out.println("_____");
        System.out.println(result);
    }
}

