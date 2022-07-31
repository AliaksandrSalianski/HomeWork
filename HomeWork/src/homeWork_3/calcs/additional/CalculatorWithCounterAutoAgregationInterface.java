package homeWork_3.calcs.additional;

import homeWork_3.calcs.api.ICalculator;

/**
 * класс реализует инерфейс ICalculator
 * содержит поле calculator типа ICalculator
 * содержит поле countOperation
 * метод incrementCountOperation() увеличивающий count на 1 при вызове
 * метод getCountOperation() возвращает значение count
 */
public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {
    private final ICalculator iCalculator;
    private long countOperation;

    /**
     * Конструктор принимает в качестве параметра ICalculator
     *
     * @param iCalculator параметр метода
     */
    public CalculatorWithCounterAutoAgregationInterface(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    /**
     * Метод возвращает количество использование калькулятора
     *
     * @return значение countOperation
     */
    public long getCountOperation() {
        return countOperation;
    }

    /**
     * Метод считает колчество использования калькулятоа
     */
    private void incrementCountOperation() {
        countOperation++;
    }

    /**
     * метод сложения
     * метод вызван у iCalculator
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возврощает сумму oneNumber и twoNumber
     */
    @Override
    public double giveSumma(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return iCalculator.giveSumma(oneNumber, twoNumber);
    }

    /**
     * метод вычитания
     * метод вызван  у iCalculator
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возвращает разность oneNumber и oneNumber
     */
    @Override
    public double giveMinus(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return iCalculator.giveMinus(oneNumber, twoNumber);
    }

    /**
     * метод умножения
     * метод вызван  у iCalculator
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возврощает произведение oneNumber и twoNumber
     */
    @Override
    public double giveMultiply(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return iCalculator.giveMultiply(oneNumber, twoNumber);
    }

    /**
     * метод деления
     * метод  вызван у iCalculator
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возвращает результат деления oneNumber на twoNumber
     */
    @Override
    public double giveDivision(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return iCalculator.giveDivision(oneNumber, twoNumber);
    }

    /**
     * метод квадратного корня
     * метод вызван  у iCalculator
     *
     * @param oneNumber параметр метода
     * @return возвращает корень oneNumber
     */
    @Override
    public double giveRoot(double oneNumber) {
        incrementCountOperation();
        return iCalculator.giveRoot(oneNumber);
    }

    /**
     * метод возведения в степень
     * метод вызван  у iCalculator
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возвращает возведение oneNumber в степень twoNumber
     */
    @Override
    public double giveDegree(double oneNumber, int twoNumber) {
        incrementCountOperation();
        return iCalculator.giveDegree(oneNumber, twoNumber);
    }

    /**
     * метод модуля числа
     * метод вызвану iCalculator
     *
     * @param oneNumber параметр метода
     * @return возвращает модуль oneNumber
     */
    @Override
    public double giveModule(double oneNumber) {
        incrementCountOperation();
        return iCalculator.giveModule(oneNumber);
    }
}
