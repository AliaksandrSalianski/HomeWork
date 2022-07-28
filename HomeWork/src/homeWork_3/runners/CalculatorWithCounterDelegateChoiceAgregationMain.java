package homeWork_3.runners;

import homeWork_3.calcs.additional.CalculatorWithCounterAutoChoiceAggregation;
import homeWork_3.calcs.simple.CalculatorWithMathCopy;
import homeWork_3.calcs.simple.CalculatorWithMathExtends;
import homeWork_3.calcs.simple.CalculatorWithOperator;

/**
 * В классе высчитывается значение выражение при помощи трех экзепляров класса CalculatorWithCounterAutoChoiceAggregation используя три разных конструктора
 * в параметры которого предались обькты классов:CalculatorWithOperator, CalculatorWithMathCopy, CalculatorWithMathExtends
 * В консоль выводится результат и количество вызова калькулятора.
 * Добавлен метод print
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
        print(calWithOperator);

        System.out.println("____calWithMathCopy____");
        print(calWithMathCopy);

        System.out.println("____calWithMatheExtends____");
        print(calWithMatheExtends);
    }

    /**
     * метод принимавет обьекты сласса CalculatorWithCounterAutoChoiceAggregation
     * и печатет результат вычисления в консоль
     * @param p
     */
    public static void print(CalculatorWithCounterAutoChoiceAggregation p) {
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        double division = p.giveDivision(28, 5);
        double degree = p.giveDegree(division, 2);
        double multi = p.giveMultiply(15, 7);
        double summa = p.giveSumma(multi, 4.1);
        double result = p.giveSumma(summa, degree);
        System.out.println("Result = "+result);
        System.out.println("Number of calls = " + p.getCountOperation());
        System.out.println("");

    }
}
