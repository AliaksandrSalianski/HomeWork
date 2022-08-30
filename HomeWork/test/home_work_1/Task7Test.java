package home_work_1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {
    static Task7 task7;

    @BeforeAll
    static void prepare() {
        task7 = new Task7();
    }

    @Test
    void testCheckPhoneIfRight() {
        byte[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        assertEquals("(123) 456-7890.", task7.checkPhone(array));
    }

    @Test
    void testCheckPhoneIfInvalidFormat() {
        byte[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
        assertEquals("Invalid format", task7.checkPhone(array));
    }

    @Test
    void testCheckPhoneIfErrorInPosition() {
        byte[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals("error in position 10", task7.checkPhone(array));
    }
}