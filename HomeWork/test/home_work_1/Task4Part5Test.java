package home_work_1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Part5Test {
    static Task4Part5 part5;

    @BeforeAll
    static void prepare() {
        part5 = new Task4Part5();
    }

    @Test
    void defineIfYes() {
        assertEquals("Yes",part5.defineEngChar(65));
    }
    @Test
    void defineIfNo() {
        assertEquals("No",part5.defineEngChar(1));
    }

}