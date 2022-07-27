package homeWork_3.calcs.simple;

/**
 * Класс является наследником класса CalculatorWithOperator.
 * в классе содержатся методы основных математических операций.
 *  Методы giveRoot,giveDegree,giveModule переопределены.
 */
public class CalculatorWithMathExtends extends CalculatorWithOperator {
    /**
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return
     */
    @Override
    public double giveSumma(double oneNumber, double twoNumber) {
        return super.giveSumma(oneNumber, twoNumber);
    }

    /**
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return
     */
    @Override
    public double giveMinus(double oneNumber, double twoNumber) {
        return super.giveMinus(oneNumber, twoNumber);
    }

    /**
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return
     */
    @Override
    public double giveMultiply(double oneNumber, double twoNumber) {
        return super.giveMultiply(oneNumber, twoNumber);
    }

    /**
     *
     * @param oneNumber
     * @param twoNumber
     * @return
     */
    @Override
    public double giveDivision(double oneNumber, double twoNumber) {
        return super.giveDivision(oneNumber, twoNumber);
    }

    /**
     *
     * @param oneNumber
     * @return
     */
    @Override
    public double giveRoot(double oneNumber) {
        return Math.sqrt(oneNumber) ;
    }

    /**
     *
     * @param oneNumber первый операнд
     * @param twoNumber второй операнд
     * @return
     */
    @Override
    public double giveDegree(double oneNumber, int twoNumber) {
        return Math.pow(oneNumber, twoNumber);
    }

    /**
     *
     * @param oneNumber
     * @return
     */
    @Override
    public double giveModule(double oneNumber) {
        return Math.abs(oneNumber);
    }
}
