package homeWork_3.runners;

import homeWork_3.calcs.additional.CalculatorWithCounterAutoComposite;

/**
 *
 */
//
public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        double division = calculator.getCalculator().giveDivision(28, 5);
        double degree = calculator.getCalculator().giveDegree(division, 2);
        double multi = calculator.getCalculator().giveMultiply(15, 7);
        double summa = calculator.getCalculator().giveSumma(multi, 4.1);
        double result = calculator.getCalculator().giveSumma(summa, degree);
        System.out.println("_____");
        System.out.println(result);
        System.out.println("count = " + calculator.getCountOperation());
    }
}