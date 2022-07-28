package homeWork_3.runners;

import homeWork_3.calcs.additional.CalculatorWithCounterAutoChoiceAggregation;
import homeWork_3.calcs.simple.CalculatorWithMathCopy;
import homeWork_3.calcs.simple.CalculatorWithMathExtends;
import homeWork_3.calcs.simple.CalculatorWithOperator;
import homeWork_3.calcs.simple.Print;

/**
 * В классе высчитывается значение выражение при помощи трех экзепляров класса CalculatorWithCounterAutoChoiceAggregation используя три разных конструктора
 * в параметры которого предались обькты классов:CalculatorWithOperator, CalculatorWithMathCopy, CalculatorWithMathExtends
 * В консоль выводится результат и количество вызова калькулятора.
 * Используется метод print для вывода в консоль
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
        Print.printAutoChoiceAggregation(calWithOperator);

        System.out.println("____calWithMathCopy____");
        Print.printAutoChoiceAggregation(calWithMathCopy);

        System.out.println("____calWithMatheExtends____");
        Print.printAutoChoiceAggregation(calWithMatheExtends);
    }


}
