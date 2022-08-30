package home_work_1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task4Part1Test {
    static Task4Part1 part1;

    @BeforeAll
    static void prepare() {
        part1 = new Task4Part1();
    }

    @Test
    void checkHonestIfZero() {
        assertEquals(2, part1.checkHonest(0));
    }

    @Test
    void checkHonestIfNumberNotHonest() {
        assertEquals(2, part1.checkHonest(1));
    }

    @Test
    void checkHonestIfNumberIsHonest() {
        assertEquals(2, part1.checkHonest(2));
    }
}