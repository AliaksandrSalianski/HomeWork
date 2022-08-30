package homeWork_2.loops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Loop3Test {
    static Loop3 loop3;

    @BeforeAll
    static void prepare() {
        loop3 = new Loop3();
    }

    @Test
    void testExponentiation() {
        assertEquals(4, loop3.exponentiation(2, 2));
    }
    @Test
    void testExponentiationIfZero() {
        assertEquals(0, loop3.exponentiation(0, 2));
    }
}