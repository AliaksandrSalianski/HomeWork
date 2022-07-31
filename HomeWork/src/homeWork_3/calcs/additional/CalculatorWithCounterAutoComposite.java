package homeWork_3.calcs.additional;

/**
 * класс реализует принцип Копозииции с классом CalculatorWithCounterAutoSuper
 * содержит поле calculator типа CalculatorWithCounterAutoSuper
 * содержит поле count
 * метод incrementCountOperation() увеличивающий count на 1 при вызове
 * метод getCountOperation() возвращает значение count
 */

public class CalculatorWithCounterAutoComposite {
    private final CalculatorWithCounterAutoSuper calculator;

    /**
     * Коструктор в котором создается обьект класса CalculatorWithCounterAutoSuper
     */
    public CalculatorWithCounterAutoComposite() {
        this.calculator = new CalculatorWithCounterAutoSuper();
    }

    private long count = 0;

    /**
     * Метод считает количество использования калькулятоа
     */
    private void incrementCountOperation() {
        count++;
    }

    /**
     * Метод возвращает количество использование калькулятора
     *
     * @return значение count
     */
    public long getCountOperation() {
        return count;
    }

    /**
     * метод сложения
     * метод вызван у обькта  класса CalculatorWithCounterAutoSuper
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возврощает сумму oneNumber и twoNumber
     */
    public double giveSumma(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return calculator.giveSumma(oneNumber, twoNumber);
    }

    /**
     * метод вычитания
     * метод вызван у обькта  класса CalculatorWithCounterAutoSuper
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возрвщает разность oneNumber и twoNumber
     */
    public double giveMinus(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return calculator.giveMinus(oneNumber, twoNumber);
    }

    /**
     * метод умножения
     * метод вызван у обькта  класса CalculatorWithCounterAutoSuper
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возврощает произведение oneNumber и twoNumber
     */
    public double giveMultiply(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return calculator.giveMultiply(oneNumber, twoNumber);
    }

    /**
     * метод деления
     * метод  вызван у обькта  класса CalculatorWithCounterAutoSuper
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return вооооозвращает результат деления oneNumber на twoNumber
     */
    public double giveDivision(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return calculator.giveDivision(oneNumber, twoNumber);
    }

    /**
     * метод квадратного кореня
     * метод вызван у обькта  класса CalculatorWithCounterAutoSuper
     *
     * @param oneNumber параметр метода
     * @return возвращает корень oneNumber
     */
    public double giveRoot(double oneNumber) {
        incrementCountOperation();
        return calculator.giveRoot(oneNumber);
    }

    /**
     * метод возведения в степень
     * метод вызван у обькта  класса CalculatorWithCounterAutoSuper
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возвращает возведение oneNumber в степень twoNumber
     */
    public double giveDegree(double oneNumber, int twoNumber) {
        incrementCountOperation();
        return calculator.giveDegree(oneNumber, twoNumber);
    }

    /**
     * метод модуля числа
     * метод вызван у обькта  класса CalculatorWithCounterAutoSuper
     *
     * @param oneNumber параметр метода
     * @return возвращает модуль oneNumber
     */
    public double giveModule(double oneNumber) {
        incrementCountOperation();
        return calculator.giveModule(oneNumber);
    }
}
