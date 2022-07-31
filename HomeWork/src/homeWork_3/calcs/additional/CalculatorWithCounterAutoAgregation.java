package homeWork_3.calcs.additional;

/**
 * класс реализует принцип Агрегаци с классом CalculatorWithCounterAutoSuper
 * содержит поле calculator типа CalculatorWithCounterAutoSuper
 * содержит поле count хронящее количество вызовов калькулятора
 * метод incrementCountOperation() увеличивающий count на 1 при вызове
 * метод getCountOperation() возвращает значение count
 */
//8
public class CalculatorWithCounterAutoAgregation {
    private final CalculatorWithCounterAutoSuper calculator;
    private long count;

    /**
     * Конструктор в который передается обьект класса CalculatorWithCounterAutoSuper
     *
     * @param calculator параметр метода
     */
    public CalculatorWithCounterAutoAgregation(CalculatorWithCounterAutoSuper calculator) {
        this.calculator = calculator;
    }

    /**
     * Метод считает колчество использования калькулятоа
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
     * @return возвращает результат деления oneNumber на twoNumber
     */
    public double giveDivision(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return calculator.giveDivision(oneNumber, twoNumber);
    }

    /**
     * метод квадратного корня
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