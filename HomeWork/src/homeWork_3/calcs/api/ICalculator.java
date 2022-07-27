package homeWork_3.calcs.api;

/**
 *
 */
public interface ICalculator {
    /**
     *
     * @param one
     * @param two
     * @return
     */
    double giveSumma(double one , double two);

    /**
     *
     * @param one
     * @param two
     * @return
     */
    double giveMinus(double one , double two);

    /**
     *
     * @param one
     * @param two
     * @return
     */
    double giveMultiply(double one , double two);

    /**
     *
     * @param one
     * @param two
     * @return
     */
    double giveDivision(double one , double two);

    /**
     *
     * @param one
     * @return
     */
    double giveRoot(double one);

    /**
     *
     * @param one
     * @param two
     * @return
     */
    double giveDegree(double one,int two);

    /**
     *
     * @param one
     * @return
     */
    double giveModule(double one);
}
