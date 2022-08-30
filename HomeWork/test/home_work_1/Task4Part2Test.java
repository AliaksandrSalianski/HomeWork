package home_work_1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task4Part2Test {
    static Task4Part2 part2;

    @BeforeAll
    static void prepare() {
        part2 = new Task4Part2();
    }

    @Test
    void findTheAverageI() {
        assertEquals(2, part2.findTheAverage(1, 2, 3));
    }
    @Test
    void findTheAverageII() {
        assertEquals(3, part2.findTheAverage(-1, 3, 4));
    }
    @Test
    void findTheAverageIII() {
        assertEquals(-2, part2.findTheAverage(-1, -2, -3));
    }
}