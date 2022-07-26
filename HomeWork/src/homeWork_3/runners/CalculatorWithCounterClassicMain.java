package homeWork_3.runners;

import homeWork_3.calcs.additional.CalculatorWithCounterClassic;

/**
 *  В клаасе создан обьект класса CalculatorWithCounterClassic
 *  при помощи обькта calWithCounter и методов высчитывается значение выражения и результат выводится в консоль
 *  метод incrementCountOperation() считает количетво вызовов
 */
public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calWithCounter = new CalculatorWithCounterClassic();
        double division = calWithCounter.giveDivision(28, 5);
        calWithCounter.incrementCountOperation();
        double degree = calWithCounter.giveDegree(division, 2);
        calWithCounter.incrementCountOperation();
        double multi = calWithCounter.giveMultiply(15, 7);
        calWithCounter.incrementCountOperation();
        double summa = calWithCounter.giveSumma(multi, 4.1);
        calWithCounter.incrementCountOperation();
        double result = calWithCounter.giveSumma(summa, degree);
        calWithCounter.incrementCountOperation();
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        System.out.println("_____");
        System.out.println(result);
        System.out.println("count = "+ calWithCounter.getCountOperation());
    }
}
