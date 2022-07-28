package homeWork_3.calcs.simple;

import homeWork_3.calcs.api.ICalculator;

/**
 * в классе представлены методы основных математических операций:
 * сложение,вычитание,умноженение,деление,корень числа,возведение в степень,модуль числа
 * класс реализует интерфейс ICalculator
 */
public class CalculatorWithOperator implements ICalculator {
    /**
     * метод сложения
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возврощает сумму oneNumber и twoNumber
     */
    public double giveSumma(double oneNumber, double twoNumber) {
        return twoNumber + oneNumber;
    }

    /**
     * метод вычитания
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возрвщает разность oneNumber и twoNumber
     */
    public double giveMinus(double oneNumber, double twoNumber) {

        return oneNumber - twoNumber;
    }

    /**
     * метод умножения
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возврощает произведение oneNumber и twoNumber
     */
    public double giveMultiply(double oneNumber, double twoNumber) {

        return oneNumber * twoNumber;
    }

    /**
     * метод деления
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return вооооозвращает результат деления oneNumber на twoNumber
     */
    public double giveDivision(double oneNumber, double twoNumber) {
        return oneNumber / twoNumber;
    }

    /**
     * метод квадратного кореня
     * @param oneNumber
     * @return возвращает корень oneNumber
     */
    public double giveRoot(double oneNumber) {

        return Math.sqrt(oneNumber) ;
    }

    /**
     * метод возведения в степень
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возвращает возведение oneNumber в степень twoNumber
     */
    public double giveDegree(double oneNumber, int twoNumber) {
        double result = 1;
        if (twoNumber <= 1) return oneNumber;
        for (int i = 1; i <= twoNumber; i++) {
            result *= oneNumber;
        }
        return result;
    }

    /**
     * метод модуля числа
     * @param oneNumber
     * @return возвращает модуль oneNumber
     */
    public double giveModule(double oneNumber) {
        return oneNumber > 0 ? oneNumber * 1 : oneNumber * -1;
    }


}
