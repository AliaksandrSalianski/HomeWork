package homeWork_3.calcs.simple;

import homeWork_3.calcs.additional.CalculatorWithCounterAutoChoiceAggregation;
import homeWork_3.calcs.api.ICalculator;

public class Print {
    /**
     * метод принимавет обьекты сласса CalculatorWithCounterAutoChoiceAggregation
     * и выводит результат вычисления в консоль и количество вызовов калькулятора
     * @param p обьет переданный в конструктор
     */
    public static void printAutoChoiceAggregation(CalculatorWithCounterAutoChoiceAggregation p) {
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        double division = p.giveDivision(28, 5);
        double degree = p.giveDegree(division, 2);
        double multi = p.giveMultiply(15, 7);
        double summa = p.giveSumma(multi, 4.1);
        double result = p.giveSumma(summa, degree);
        System.out.println("Result = "+result);
        System.out.println("Number of calls = " + p.getCountOperation());
        System.out.println(" ");
    }

    /**
     * Метод принимает обьекты классов которые реализуют интерфейс ICalculator и выводит в консоль результат выражения
     * @param i обьет переданный в конструктор
     */
    public static void printWithICalculator(ICalculator i) {
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        double division = i.giveDivision(28, 5);
        double degree = i.giveDegree(division, 2);
        double multi = i.giveMultiply(15, 7);
        double summa = i.giveSumma(multi, 4.1);
        double result = i.giveSumma(summa, degree);
        System.out.println("Result = "+result);


    }
}
