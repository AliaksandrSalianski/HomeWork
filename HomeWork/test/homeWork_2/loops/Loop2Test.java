package homeWork_2.loops;

import home_work_1.Task4Part1;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Loop2Test {
    static Loop2 loop2;

    @BeforeAll
    static void prepare() {
        loop2 = new Loop2();
    }


    @Test
    void testMultiplicationIf_12345() {
        assertEquals("1*2*3*4*5=120", loop2.multiplication("12345"));
    }
    @Test
    void testMultiplicationIf_NotNumber() {
        assertEquals("Введено не число", loop2.multiplication("12S45"));
    }
    @Test
    void testMultiplicationIf_NotIntegerNumber() {
        assertEquals("Введено не целое число", loop2.multiplication("124.5"));
    }
    @Test
    void testMultiplicationIfHaveZero() {
        assertEquals("1*2*4*0*5=0", loop2.multiplication("12405"));
    }

}