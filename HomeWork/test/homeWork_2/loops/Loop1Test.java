package homeWork_2.loops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Loop1Test {
    static Loop1 loop1;

    @BeforeAll
    static void prepare() {
        loop1 = new Loop1();
    }

    @Test
    void testMultiplyWithCycle_IfNumber10() {
        assertEquals("1*2*3*4*5*6*7*8*9*10=3628800",loop1.multiplyWithCycle(10));
    }
    @Test
    void testMultiplyWithCycle_IfNumberMinus() {
        assertEquals("wrong input",loop1.multiplyWithCycle(-10));
    }
    @Test
    void testMultiplyWithCycle_IfOverflow() {
        assertEquals("overflow",loop1.multiplyWithCycle(22));
    }
}