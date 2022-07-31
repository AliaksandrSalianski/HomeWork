package homeWork_3.calcs.additional;

import homeWork_3.calcs.simple.CalculatorWithMathCopy;
import homeWork_3.calcs.simple.CalculatorWithMathExtends;
import homeWork_3.calcs.simple.CalculatorWithOperator;

/**
 * класс реализует принцип Агрегаци с классом CCalculatorWithOperator,CalculatorWithMathExtends,CalculatorWithOperator
 * содержит поле calculator типа CalculatorWithOperator
 * содержит поле calculator типа CalculatorWithMathExtends
 * содержит поле calculator типа CalculatorWithOperator
 * содержит поле countOperation
 * содержит поле calcWithOperator
 * содержит поле calcWithMathCopy
 * содержит поле alcWithMathExtends
 * метод incrementCountOperation() увеличивающий count на 1 при вызове
 * метод getCountOperation() возвращает значение count
 */

public class CalculatorWithCounterAutoChoiceAggregation {
    private CalculatorWithOperator calcWithOperator;
    private CalculatorWithMathCopy calcWithMathCopy;
    private CalculatorWithMathExtends calcWithMathExtends;
    private long countOperation;

    /**
     * Конструктор в который передается обьект класса CalculatorWithOperator
     *
     * @param calcWithOperator типа CalculatorWithOperator
     */
    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithOperator calcWithOperator) {
        this.calcWithOperator = calcWithOperator;
    }

    /**
     * Конструктор в который передается обьект класса CalculatorWithMathCopy
     *
     * @param calcWithMathCopy типа CalculatorWithMathCopy
     */
    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathCopy calcWithMathCopy) {
        this.calcWithMathCopy = calcWithMathCopy;
    }

    /**
     * Конструктор в который передается обьект класса CalculatorWithMathExtends
     *
     * @param calcWithMathExtends типа CalculatorWithMathExtends
     */
    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathExtends calcWithMathExtends) {
        this.calcWithMathExtends = calcWithMathExtends;
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
     * метод вызван у обькта в зависимости от класа преданоого в конструктор
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возврощает сумму oneNumber и twoNumber
     */
    public double giveSumma(double oneNumber, double twoNumber) {
        incrementCountOperation();
        if (calcWithOperator != null) {
            return calcWithOperator.giveSumma(oneNumber, twoNumber);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.giveSumma(oneNumber, twoNumber);
        } else {
            return calcWithMathExtends.giveSumma(oneNumber, twoNumber);
        }
    }

    /**
     * метод вычитания
     * метод вызван у обькта в зависимости от класа преданоого в конструктор
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возрвщает разность oneNumber и twoNumber
     */
    public double giveMinus(double oneNumber, double twoNumber) {
        incrementCountOperation();
        if (calcWithOperator != null) {
            return calcWithOperator.giveMinus(oneNumber, twoNumber);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.giveMinus(oneNumber, twoNumber);
        } else {
            return calcWithMathExtends.giveMinus(oneNumber, twoNumber);
        }
    }

    /**
     * метод умножения
     * метод вызван у обькта в зависимости от класа преданного в конструктор
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возврощает произведение oneNumber и twoNumber
     */
    public double giveMultiply(double oneNumber, double twoNumber) {
        incrementCountOperation();
        if (calcWithOperator != null) {
            return calcWithOperator.giveMultiply(oneNumber, twoNumber);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.giveMultiply(oneNumber, twoNumber);
        } else {
            return calcWithMathExtends.giveMultiply(oneNumber, twoNumber);
        }
    }

    /**
     * метод деления
     * метод вызван у обькта в зависимости от класа преданного в конструктор
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return вооооозвращает результат деления oneNumber на twoNumber
     */
    public double giveDivision(double oneNumber, double twoNumber) {
        incrementCountOperation();
        if (calcWithOperator != null) {
            return calcWithOperator.giveDivision(oneNumber, twoNumber);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.giveDivision(oneNumber, twoNumber);
        } else {
            return calcWithMathExtends.giveDivision(oneNumber, twoNumber);
        }
    }

    /**
     * метод квадратного корня
     * метод вызван у обькта в зависимости от класа преданного в конструктор
     *
     * @param oneNumber параметр метода
     * @return возвращает корень oneNumber
     */
    public double giveRoot(double oneNumber) {
        incrementCountOperation();
        if (calcWithOperator != null) {
            return calcWithOperator.giveRoot(oneNumber);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.giveRoot(oneNumber);
        } else {
            return calcWithMathExtends.giveRoot(oneNumber);
        }
    }

    /**
     * метод возведения в степень
     * метод вызван у обькта в зависимости от класа преданного в конструктор
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return возвращает возведение oneNumber в степень twoNumber
     */
    public double giveDegree(double oneNumber, int twoNumber) {
        incrementCountOperation();
        if (calcWithOperator != null) {
            return calcWithOperator.giveDegree(oneNumber, twoNumber);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.giveDegree(oneNumber, twoNumber);
        } else {
            return calcWithMathExtends.giveDegree(oneNumber, twoNumber);
        }
    }

    /**
     * метод модуля числа
     * метод вызван у обькта в зависимости от класа преданного в конструктор
     *
     * @param oneNumber параметр метода
     * @return возвращает модуль oneNumber
     */
    public double giveModule(double oneNumber) {
        incrementCountOperation();
        if (calcWithOperator != null) {
            return calcWithOperator.giveModule(oneNumber);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.giveModule(oneNumber);
        } else {
            return calcWithMathExtends.giveModule(oneNumber);
        }
    }
}