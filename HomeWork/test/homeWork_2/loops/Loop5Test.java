package homeWork_2.loops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Loop5Test {
    static Loop5 loop5;

    @BeforeAll
    static void prepare() {
        loop5 = new Loop5();
    }

    @Test
    void findMaxNumber() {
        assertEquals(5, loop5.findMaxNumber(1235123));
    }

    @Test
    void testCountEvenAndOdd() {
        int [] array = {2,2};
        assertArrayEquals(array,loop5.countEvenAndOdd(1122));
    }

    @Test
    void testFibWithArray() {
        long [] array = {1,2,3,5,8};
        assertArrayEquals(array, loop5.fibWithArray(5));
    }
    @Test
    void testFibWithArrayIfOneNumber() {
        long [] array = {1};
        assertArrayEquals(array, loop5.fibWithArray(1));
    }

    @Test
    void testStepOutput() {
assertEquals("1 3 5 7 9 ",loop5.stepOutput(1, 10, 2));
    }

    @Test
    void testNumberFlip() {
        assertEquals("987654321",loop5.numberFlip(123456789));
    }
}