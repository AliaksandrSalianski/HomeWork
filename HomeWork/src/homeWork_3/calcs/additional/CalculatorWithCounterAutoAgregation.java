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

    public long getCount() {
        return count;
    }
    public CalculatorWithCounterAutoAgregation(CalculatorWithCounterAutoSuper calculator) {
        this.calculator = calculator;
    }

    public CalculatorWithCounterAutoSuper getCalculator() {
        incrementCountOperation();
        return calculator;
    }
}
