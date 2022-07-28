package homeWork_3.calcs.simple;

import homeWork_3.calcs.api.ICalculator;

/**
 * Класс является наследником класса CalculatorWithOperator и реализует интерфейс ICalculator
 * в классе содержатся методы основных математических операций.
 * сложение,вычитание,умноженение,деление,корень числа,возведение в степень,модуль числа
 * Методы giveRoot,giveDegree,giveModule переопределены. Методы сложение,вычитание,умноженение,деление
 * имеют реализацию родительского класса
 */
public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    /**
     * метод сложения
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возврощает сумму oneNumber и twoNumber
     */
    @Override
    public double giveSumma(double oneNumber, double twoNumber) {
        return super.giveSumma(oneNumber, twoNumber);
    }

    /**
     * метод вычитания
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возрвщает разность oneNumber и twoNumber
     */
    @Override
    public double giveMinus(double oneNumber, double twoNumber) {
        return super.giveMinus(oneNumber, twoNumber);
    }

    /**
     * метод умножения
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возврощает произведение oneNumber и twoNumber
     */
    @Override
    public double giveMultiply(double oneNumber, double twoNumber) {
        return super.giveMultiply(oneNumber, twoNumber);
    }

    /**
     * метод деления
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return вооооозвращает результат деления oneNumber на twoNumber
     */
    @Override
    public double giveDivision(double oneNumber, double twoNumber) {
        return super.giveDivision(oneNumber, twoNumber);
    }

    /**
     * метод квадратного кореня
     * @param oneNumber
     * @return возвращает корень oneNumber
     */
    @Override
    public double giveRoot(double oneNumber) {
        return Math.sqrt(oneNumber) ;
    }

    /**
     * метод возведения в степень
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возвращает возведение oneNumber в степень twoNumber
     */
    @Override
    public double giveDegree(double oneNumber, int twoNumber) {
        return Math.pow(oneNumber, twoNumber);
    }

    /**
     * метод модуля числа
     * @param oneNumber
     * @return возвращает модуль oneNumber
     */
    @Override
    public double giveModule(double oneNumber) {
        return Math.abs(oneNumber);
    }
}
