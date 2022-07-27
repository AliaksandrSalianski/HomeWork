package homeWork_3.calcs.additional;

import homeWork_3.calcs.simple.CalculatorWithMathCopy;
import homeWork_3.calcs.simple.CalculatorWithMathExtends;
import homeWork_3.calcs.simple.CalculatorWithOperator;

/**
 *
 */
//9
public class CalculatorWithCounterAutoChoiceAggregation {
    private CalculatorWithOperator calcWithOperator;
    private CalculatorWithMathCopy calcWithMathCopy;
    private CalculatorWithMathExtends calcWithMathExtends;
    private long countOperation;

    /**
     * @param calcWithOperator
     */
    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithOperator calcWithOperator) {
        this.calcWithOperator = calcWithOperator;
    }

    /**
     * @param calcWithMathCopy
     */
    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathCopy calcWithMathCopy) {
        this.calcWithMathCopy = calcWithMathCopy;
    }

    /**
     * @param calcWithMathExtends
     */
    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathExtends calcWithMathExtends) {
        this.calcWithMathExtends = calcWithMathExtends;
    }

    /**
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

    /**
     * @param oneNumber
     * @param twoNumber
     * @return
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
     * @param oneNumber
     * @param twoNumber
     * @return
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
     * @param oneNumber
     * @param twoNumber
     * @return
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
     * @param oneNumber
     * @param twoNumber
     * @return
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
     * @param oneNumber
     * @return
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
     * @param oneNumber
     * @param twoNumber
     * @return
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
     * @param oneNumber
     * @return
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