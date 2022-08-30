package home_work_1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task4Part4Test {
    static Task4Part4 part4;

    @BeforeAll
    static void prepare() {
        part4 = new Task4Part4();
    }
    @Test
    void converting_1ByteToKilobyte() {
        assertEquals(1, part4.converting("bytesToKilobytes",1024));

    }
    @Test
    void converting_1KilobyteToByte() {
        assertEquals(1024, part4.converting("kilobytesToBytes",1));

    }
    @Test
    void convertingWithWrongInput() {
        assertEquals(0, part4.converting("foo",1024));

    }

}