package homeWork_2.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Array4Test {
    static Array4 array4;
    static int[] array;

    @BeforeAll
    static void prepare() {
        array4 = new Array4();
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    @Test
    void sumOfEvenPositive() {
        assertEquals(30, array4.sumOfEvenPositive(array));
    }

    @Test
    void getMaxOfEven() {
       assertEquals(9,array4.getMaxOfEven(array));
    }

    @Test
    void printItemsBelowAverage() {
        assertEquals("1 2 3 4 ", array4.printItemsBelowAverage(array));
    }

    @Test
    void printTwoMinInArray() {
        int [] arrayFoo = {1,2};
        assertArrayEquals(arrayFoo,array4.printTwoMinInArray(array));
    }

    @Test
    void deleteInInterval() {
        int [] arrayFoo = {9,10,0,0,0,0,0,0,0,0};
      assertArrayEquals(arrayFoo, array4.deleteInInterval(array, 1, 8));
    }

    @Test
    void getSumOfAllDigits() {
        assertEquals(55, array4.getSumOfAllDigits(array));
    }
}