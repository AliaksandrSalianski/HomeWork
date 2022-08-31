package homeWork_3.calcs.api;

import homeWork_3.calcs.additional.CalculatorWithCounterAutoSuper;
import homeWork_3.calcs.additional.CalculatorWithCounterClassic;
import homeWork_3.calcs.simple.CalculatorWithMathCopy;
import homeWork_3.calcs.simple.CalculatorWithMathExtends;
import homeWork_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ICalculatorTest {
    static ICalculator iCalculator1;
    static ICalculator iCalculator2;
    static ICalculator iCalculator3;
    static ICalculator iCalculator4;
    static ICalculator iCalculator5;

    @BeforeAll
    static void prepare() {

        iCalculator1 = new CalculatorWithOperator();
        iCalculator2 = new CalculatorWithMathCopy();
        iCalculator3 = new CalculatorWithCounterAutoSuper();
        iCalculator4 = new CalculatorWithCounterClassic();
        iCalculator5 = new CalculatorWithMathExtends();
    }

    @Test
    void giveSumma() {
        assertEquals(2, iCalculator1.giveSumma(1, 1));
        assertEquals(2, iCalculator2.giveSumma(1, 1));
        assertEquals(2, iCalculator3.giveSumma(1, 1));
        assertEquals(2, iCalculator4.giveSumma(1, 1));
        assertEquals(2, iCalculator5.giveSumma(1, 1));

        assertEquals(0, iCalculator1.giveSumma(1, -1));
        assertEquals(0, iCalculator2.giveSumma(1, -1));
        assertEquals(0, iCalculator3.giveSumma(1, -1));
        assertEquals(0, iCalculator4.giveSumma(1, -1));
        assertEquals(0, iCalculator5.giveSumma(1, -1));


    }

    @Test
    void giveMinus() {
        assertEquals(0, iCalculator1.giveMinus(1, 1));
        assertEquals(0, iCalculator2.giveMinus(1, 1));
        assertEquals(0, iCalculator3.giveMinus(1, 1));
        assertEquals(0, iCalculator4.giveMinus(1, 1));
        assertEquals(0, iCalculator5.giveMinus(1, 1));

        assertEquals(2, iCalculator1.giveMinus(1, -1));
        assertEquals(2, iCalculator2.giveMinus(1, -1));
        assertEquals(2, iCalculator3.giveMinus(1, -1));
        assertEquals(2, iCalculator4.giveMinus(1, -1));
        assertEquals(2, iCalculator5.giveMinus(1, -1));
    }

    @Test
    void giveMultiply() {
        assertEquals(100, iCalculator1.giveMultiply(1, 100));
        assertEquals(100, iCalculator2.giveMultiply(1, 100));
        assertEquals(100, iCalculator3.giveMultiply(1, 100));
        assertEquals(100, iCalculator4.giveMultiply(1, 100));
        assertEquals(100, iCalculator5.giveMultiply(1, 100));

        assertEquals(0, iCalculator1.giveMultiply(1, 0));
        assertEquals(0, iCalculator2.giveMultiply(1, 0));
        assertEquals(0, iCalculator3.giveMultiply(1, 0));
        assertEquals(0, iCalculator4.giveMultiply(1, 0));
        assertEquals(0, iCalculator5.giveMultiply(1, 0));
    }

    @Test
    void giveDivision() {
        assertEquals(5, iCalculator1.giveDivision(10, 2));
        assertEquals(5, iCalculator2.giveDivision(10, 2));
        assertEquals(5, iCalculator3.giveDivision(10, 2));
        assertEquals(5, iCalculator4.giveDivision(10, 2));
        assertEquals(5, iCalculator5.giveDivision(10, 2));

        assertEquals(2.5, iCalculator1.giveDivision(5, 2));
        assertEquals(2.5, iCalculator2.giveDivision(5, 2));
        assertEquals(2.5, iCalculator3.giveDivision(5, 2));
        assertEquals(2.5, iCalculator4.giveDivision(5, 2));
        assertEquals(2.5, iCalculator5.giveDivision(5, 2));
    }

    @Test
    void giveRoot() {
        assertEquals(5, iCalculator1.giveRoot(25));
        assertEquals(5, iCalculator2.giveRoot(25));
        assertEquals(5, iCalculator3.giveRoot(25));
        assertEquals(5, iCalculator4.giveRoot(25));
        assertEquals(5, iCalculator5.giveRoot(25));

        assertEquals(3, iCalculator1.giveRoot(9));
        assertEquals(3, iCalculator2.giveRoot(9));
        assertEquals(3, iCalculator3.giveRoot(9));
        assertEquals(3, iCalculator4.giveRoot(9));
        assertEquals(3, iCalculator5.giveRoot(9));
    }

    @Test
    void giveDegree() {
        assertEquals(25, iCalculator1.giveDegree(5,2));
        assertEquals(25, iCalculator2.giveDegree(5,2));
        assertEquals(25, iCalculator3.giveDegree(5,2));
        assertEquals(25, iCalculator4.giveDegree(5,2));
        assertEquals(25, iCalculator5.giveDegree(5,2));

        assertEquals(9, iCalculator1.giveDegree(3,2));
        assertEquals(9, iCalculator2.giveDegree(3,2));
        assertEquals(9, iCalculator3.giveDegree(3,2));
        assertEquals(9, iCalculator4.giveDegree(3,2));
        assertEquals(9, iCalculator5.giveDegree(3,2));

    }

    @Test
    void giveModule() {
        assertEquals(2, iCalculator1.giveModule(-2));
        assertEquals(2, iCalculator2.giveModule(-2));
        assertEquals(2, iCalculator3.giveModule(-2));
        assertEquals(2, iCalculator4.giveModule(-2));
        assertEquals(2, iCalculator5.giveModule(-2));

        assertEquals(3, iCalculator1.giveModule(3));
        assertEquals(3, iCalculator2.giveModule(3));
        assertEquals(3, iCalculator3.giveModule(3));
        assertEquals(3, iCalculator4.giveModule(3));
        assertEquals(3, iCalculator5.giveModule(3));
    }


}