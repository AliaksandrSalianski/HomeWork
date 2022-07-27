package homeWork_3.calcs.additional;

/**
 *
 */
//7
public class CalculatorWithCounterAutoComposite {
    private final CalculatorWithCounterAutoSuper calculator;
    private long count = 0;

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
     */
    public CalculatorWithCounterAutoComposite() {
        this.calculator = new CalculatorWithCounterAutoSuper();
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
