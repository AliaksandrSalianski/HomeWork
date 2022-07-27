package homeWork_3.calcs.additional;

/**
 *
 */
//7
public class CalculatorWithCounterAutoComposite {
    private final CalculatorWithCounterAutoSuper calculator;
    private long count = 0;

    private void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    public CalculatorWithCounterAutoComposite() {
        this.calculator = new CalculatorWithCounterAutoSuper();
    }

    public double giveSumma(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return calculator.giveSumma(oneNumber, twoNumber);
    }

    public double giveMinus(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return calculator.giveMinus(oneNumber, twoNumber);
    }

    public double giveMultiply(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return calculator.giveMultiply(oneNumber, twoNumber);
    }

    public double giveDivision(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return calculator.giveDivision(oneNumber, twoNumber);
    }

    public double giveRoot(double oneNumber) {
        incrementCountOperation();
        return calculator.giveRoot(oneNumber);
    }

    public double giveDegree(double oneNumber, int twoNumber) {
        incrementCountOperation();
        return calculator.giveDegree(oneNumber, twoNumber);
    }

    public double giveModule(double oneNumber) {
        incrementCountOperation();
        return calculator.giveModule(oneNumber);
    }
}
