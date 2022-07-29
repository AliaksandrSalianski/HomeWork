package homeWork_3.runners;

import homeWork_3.calcs.additional.CalculatorWithMemory;
import homeWork_3.calcs.simple.CalculatorWithMathExtends;

/**
 * В классе создан экземпляр калькулятора и используя методы из данного экземпляра посчитано выражение
 * Результат выведен в консолью В мэйне запрещается использование переменных для хранения значений участвующих в просчёте, а также результатов
 * работы методов калькулятора, можно использовать только литералы и метод получения из памяти записанного значения.
 */
public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithMemory calculator = new CalculatorWithMemory(calculatorWithMathExtends);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        calculator.giveDivision(28, 5);
        calculator.memorize();
        calculator.giveDegree(calculator.takeOutOfMemory(), 2);
        calculator.memorize();
        calculator.giveSumma(calculator.giveMultiply(15, 7), calculator.takeOutOfMemory());
        calculator.memorize();
        calculator.giveSumma(4.1, calculator.takeOutOfMemory());
        calculator.memorize();
        System.out.println(calculator.takeOutOfMemory());
    }
}
