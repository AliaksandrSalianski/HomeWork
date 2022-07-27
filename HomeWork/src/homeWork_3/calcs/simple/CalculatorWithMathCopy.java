package homeWork_3.calcs.simple;

import homeWork_3.calcs.api.ICalculator;

/**
 * в классе содержаться методы основных математических операций
 */
public class CalculatorWithMathCopy implements ICalculator {

    /**
     * метод сложения
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возврощает сумму параметров метода
     */
    public double giveSumma(double oneNumber, double twoNumber) {
        return twoNumber + oneNumber;
    }

    /**
     * метод вычитания
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возрвщает разность oneNumber и twoNumber
     */
    public double giveMinus(double oneNumber, double twoNumber) {

        return oneNumber - twoNumber;
    }

    /**
     * метд умножения
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возврощает произведение параметров метода
     */
    public double giveMultiply(double oneNumber, double twoNumber) {

        return oneNumber * twoNumber;
    }

    /**
     * метод деления
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return вооооозвращает результат деления oneNumber на twoNumber
     */
    public double giveDivision(double oneNumber, double twoNumber) {
        return oneNumber / twoNumber;
    }


    /**
     * метод квадратного кореня
     *
     * @param oneNumber
     * @return возвращает корень числа
     */
    public double giveRoot(double oneNumber) {

        return Math.sqrt(oneNumber);
    }

    /**
     * метод возведения в степень
     *
     * @param oneNumber число возводимое в степень
     * @param twoNumber степень числа
     * @return возвращает возведение oneNumber в степень twoNumber
     */
    public double giveDegree(double oneNumber, int twoNumber) {

        return Math.pow(oneNumber, twoNumber);
    }

    /**
     * метод модуля числа
     *
     * @param oneNumber
     * @return возвращает модуль oneNumber
     */
    public double giveModule(double oneNumber) {
        return Math.abs(oneNumber);
    }
}
