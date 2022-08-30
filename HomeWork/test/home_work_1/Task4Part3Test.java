package home_work_1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Part3Test {
    static Task4Part3 part3;

    @BeforeAll
    static void prepare() {
        part3 = new Task4Part3();
    }

    @Test
    void checkDivisionOf_6_And_3() {
        assertEquals(2, part3.checkDivisionOfTwoNumbers(6, 3));
    }
    @Test
    void checkDivisionOf_7_And_2() {
        assertEquals(0.5, part3.checkDivisionOfTwoNumbers(7, 2));
    }
    @Test
    void checkDivisionOf_6_And_0() {
        assertEquals(Double.POSITIVE_INFINITY, part3.checkDivisionOfTwoNumbers(6, 0));
    }
    @Test
    void checkDivisionOf_Minus6_And_3() {
        assertEquals(Double.NEGATIVE_INFINITY, part3.checkDivisionOfTwoNumbers(-6, 0));
    }
    @Test
    void checkDivisionOf_0_And_0() {
        assertEquals(Double.NaN, part3.checkDivisionOfTwoNumbers(0, 0));
    }
}