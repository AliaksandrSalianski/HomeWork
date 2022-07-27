package homeWork_3.runners;

import homeWork_3.calcs.additional.CalculatorWithCounterAutoChoiceAggregation;
import homeWork_3.calcs.simple.CalculatorWithMathCopy;
import homeWork_3.calcs.simple.CalculatorWithMathExtends;
import homeWork_3.calcs.simple.CalculatorWithOperator;

/**
 *
 */
public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithOperator withOperator = new CalculatorWithOperator();
        CalculatorWithMathCopy withMathCopy = new CalculatorWithMathCopy();
        CalculatorWithMathExtends withMathExtends = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoChoiceAggregation calWithOperator = new CalculatorWithCounterAutoChoiceAggregation(withOperator);
        CalculatorWithCounterAutoChoiceAggregation calWithMathCopy = new CalculatorWithCounterAutoChoiceAggregation(withMathCopy);
        CalculatorWithCounterAutoChoiceAggregation calWithMatheExtends = new CalculatorWithCounterAutoChoiceAggregation(withMathExtends);

        System.out.println("____calWithOperator____");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        double division = calWithOperator.giveDivision(28, 5);
        double degree = calWithOperator.giveDegree(division, 2);
        double multi = calWithOperator.giveMultiply(15, 7);
        double summa = calWithOperator.giveSumma(multi, 4.1);
        double result = calWithOperator.giveSumma(summa, degree);
        System.out.println("____");
        System.out.println(result);
        System.out.println("count = " + calWithOperator.getCountOperation());

        System.out.println("____calWithMathCopy____");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        division = calWithMathCopy.giveDivision(28, 5);
        degree = calWithMathCopy.giveDegree(division, 2);
        multi = calWithMathCopy.giveMultiply(15, 7);
        summa = calWithMathCopy.giveSumma(multi, 4.1);
        result = calWithMathCopy.giveSumma(summa, degree);
        System.out.println("____");
        System.out.println(result);
        System.out.println("count = " + calWithOperator.getCountOperation());

        System.out.println("____calWithMatheExtends____");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        division = calWithMatheExtends.giveDivision(28, 5);
        degree = calWithMatheExtends.giveDegree(division, 2);
        multi = calWithMatheExtends.giveMultiply(15, 7);
        summa = calWithMatheExtends.giveSumma(multi, 4.1);
        result = calWithMatheExtends.giveSumma(summa, degree);
        System.out.println("____");
        System.out.println(result);
        System.out.println("count = " + calWithOperator.getCountOperation());
    }
}
