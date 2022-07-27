package homeWork_3.calcs.additional;

import homeWork_3.calcs.simple.CalculatorWithMathCopy;

/**
 *
 */
//8
public class CalculatorWithCounterAutoAgregation {
    private final CalculatorWithCounterAutoSuper calculator;
    private long count;

    /**
     *
     */
    private void incrementCountOperation() {
        count++;
    }

    /**
     *
     * @return
     */
    public long getCountOperation() {
        return count;
    }

    /**
     *
     * @param calculator
     */
    public CalculatorWithCounterAutoAgregation(CalculatorWithCounterAutoSuper calculator) {
        this.calculator = calculator;
    }

    /**
     *
     * @param oneNumber
     * @param twoNumber
     * @return
     */
    public double giveSumma(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return calculator.giveSumma(oneNumber, twoNumber);
    }

    /**
     *
     * @param oneNumber
     * @param twoNumber
     * @return
     */
    public double giveMinus(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return calculator.giveMinus(oneNumber, twoNumber);
    }

    /**
     *
     * @param oneNumber
     * @param twoNumber
     * @return
     */
    public double giveMultiply(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return calculator.giveMultiply(oneNumber, twoNumber);
    }

    /**
     *
     * @param oneNumber
     * @param twoNumber
     * @return
     */
    public double giveDivision(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return calculator.giveDivision(oneNumber, twoNumber);
    }

    /**
     *
     * @param oneNumber
     * @return
     */
    public double giveRoot(double oneNumber) {
        incrementCountOperation();
        return calculator.giveRoot(oneNumber);
    }

    /**
     *
     * @param oneNumber
     * @param twoNumber
     * @return
     */
    public double giveDegree(double oneNumber, int twoNumber) {
        incrementCountOperation();
        return calculator.giveDegree(oneNumber, twoNumber);
    }

    /**
     *
     * @param oneNumber
     * @return
     */
    public double giveModule(double oneNumber) {
        incrementCountOperation();
        return calculator.giveModule(oneNumber);
    }
}