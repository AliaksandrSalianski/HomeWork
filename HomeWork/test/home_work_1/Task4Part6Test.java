package home_work_1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task4Part6Test {
    static Task4Part6 part6;

    @BeforeAll
    static void prepare() {
        part6 = new Task4Part6();
    }

    @Test
    void testLeapYearIfYes() {
        assertEquals("YES", part6.leapYear(2008));
    }
    @Test
    void testLeapYearIfNo() {
        assertEquals("NO", part6.leapYear(2009));
    }
}