package homeWork_3.calcs.additional;

import homeWork_3.calcs.api.ICalculator;

/**
 *
 */
public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {
    ICalculator iCalculator;
    private long countOperation;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    /**
     *
     * @return
     */
    public long getCountOperation() {
        return countOperation;
    }

    /**
     *
     */
    private void incrementCountOperation() {
        countOperation++;
    }

    @Override
    public double giveSumma(double one, double two) {
        incrementCountOperation();
        return iCalculator.giveSumma(one, two);
    }

    @Override
    public double giveMinus(double one, double two) {
        incrementCountOperation();
        return iCalculator.giveMinus(one, two);
    }

    @Override
    public double giveMultiply(double one, double two) {
        incrementCountOperation();
        return iCalculator.giveMultiply(one, two);
    }

    @Override
    public double giveDivision(double one, double two) {
        incrementCountOperation();
        return iCalculator.giveDivision(one, two);
    }

    @Override
    public double giveRoot(double one) {
        incrementCountOperation();
        return iCalculator.giveRoot(one);
    }

    @Override
    public double giveDegree(double one, int two) {
        incrementCountOperation();
        return iCalculator.giveDegree(one, two);
    }

    @Override
    public double giveModule(double one) {
        incrementCountOperation();
        return 0;
    }
}
