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

    public long getCount() {
        return count;
    }

    public CalculatorWithCounterAutoComposite() {
        this.calculator = new CalculatorWithCounterAutoSuper();
    }

    public CalculatorWithCounterAutoSuper getCalculator() {
        incrementCountOperation();
        return calculator;
    }
}
