package homeWork_3.calcs.additional;

import homeWork_3.calcs.simple.CalculatorWithMathExtends;

/**
 * класс является наследником класса CalculatorWithMathExtends
 * содержит поле count
 * метод incrementCountOperation() увеличивающий count на 1 при вызове
 * метод getCountOperation() возвращает значение count
 * методы родительского класса переопределены добавлен подсчет вызова калькулятора
 */
public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long countOperation;

    /**
     *Метод возвращает количество использование калькулятора
     * @return значение count
     */
    public long getCountOperation() {
        return countOperation;
    }

    /**
     *Метод считает колчество использования калькулятоа
     */
    private void incrementCountOperation() {
        countOperation++;
    }

    /**
     * метод сложения
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возврощает сумму oneNumber и twoNumber
     */
    @Override
    public double giveSumma(double oneNumber, double twoNumber) {
        incrementCountOperation();
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
        incrementCountOperation();
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
        incrementCountOperation();
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
        incrementCountOperation();
        return super.giveDivision(oneNumber, twoNumber);
    }

    /**
     * метод квадратного кореня
     * @param oneNumber
     * @return возвращает корень oneNumber
     */
    @Override
    public double giveRoot(double oneNumber) {
        incrementCountOperation();
        return super.giveRoot(oneNumber);
    }

    /**
     * метод возведения в степень
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возвращает возведение oneNumber в степень twoNumber
     */
    @Override
    public double giveDegree(double oneNumber, int twoNumber) {
        incrementCountOperation();
        return super.giveDegree(oneNumber, twoNumber);
    }

    /**
     * метод модуля числа
     * @param oneNumber
     * @return возвращает модуль oneNumber
     */
    @Override
    public double giveModule(double oneNumber) {
        incrementCountOperation();
        return super.giveModule(oneNumber);
    }
}
