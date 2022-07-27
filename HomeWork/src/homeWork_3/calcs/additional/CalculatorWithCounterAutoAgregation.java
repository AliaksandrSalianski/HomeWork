package homeWork_3.calcs.additional;

import homeWork_3.calcs.simple.CalculatorWithMathCopy;

/**
 *
 */
//8
public class CalculatorWithCounterAutoAgregation {
    private final CalculatorWithCounterAutoSuper calculator;
    private long count;

    private void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithCounterAutoSuper calculator) {
        this.calculator = calculator;
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