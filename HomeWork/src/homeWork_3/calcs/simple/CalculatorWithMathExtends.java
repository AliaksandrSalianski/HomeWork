package homeWork_3.calcs.simple;

/**
 * Класс является наследником класса CalculatorWithOperator.
 * в классе содержатся методы основных математических операций.
 *  Методы giveRoot,giveDegree,giveModule переопределены.
 */
public class CalculatorWithMathExtends extends CalculatorWithOperator {
    @Override
    public double giveSumma(double oneNumber, double twoNumber) {
        return super.giveSumma(oneNumber, twoNumber);
    }

    @Override
    public double giveMinus(double oneNumber, double twoNumber) {
        return super.giveMinus(oneNumber, twoNumber);
    }

    @Override
    public double giveMultiply(double oneNumber, double twoNumber) {
        return super.giveMultiply(oneNumber, twoNumber);
    }

    @Override
    public double giveDivision(double oneNumber, double twoNumber) {
        return super.giveDivision(oneNumber, twoNumber);
    }

    @Override
    public double giveRoot(double oneNumber) {
        return Math.sqrt(oneNumber) ;
    }

    @Override
    public double giveDegree(double oneNumber, int twoNumber) {
        return Math.pow(oneNumber, twoNumber);
    }

    @Override
    public double giveModule(double oneNumber) {
        return Math.abs(oneNumber);
    }
}
