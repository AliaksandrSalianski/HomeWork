package home_work_1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task5Test {
    static Task5 task5;

    @BeforeAll
    static void prepare() {
        task5 = new Task5();
    }

    @Test
    void testSleepInIfWeekDay_FalseAndVacation_False() {
        assertEquals("sleep",task5.sleepIn(false, false));
    }
    @Test
    void testSleepInIfWeekDay_TrueAndVacation_True() {
        assertEquals("sleep",task5.sleepIn(true, true));
    }
    @Test
    void testSleepInIfWeekDay_TrueAndVacation_False() {
        assertEquals("work",task5.sleepIn(true, false));
    }

}