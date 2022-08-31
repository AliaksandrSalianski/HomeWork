package homeWork_2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SortUtilsTest {
    static SortUtils sortUtils;
    static int[] arrayFoo1;
    static int[] arrayFoo2;
    static int[] arrayFoo3;
    static int[] arrayFoo4;
    static int[] arrayFoo5;
    static int[] arrayFoo6;
    static int[] arrayFoo7;
    static int[] arrayFoo8;

    @BeforeAll
    static void prepare() {
        sortUtils = new SortUtils();
        arrayFoo1 = new int[]{1, 2, 3, 4, 5, 6};
        arrayFoo2 = new int[]{1, 1, 1, 1};
        arrayFoo3 = new int[]{9, 1, 5, 99, 9, 9};
        arrayFoo4 = new int[]{};
        arrayFoo5 = new int[]{6, 5, 4, 3, 2, 1};
        arrayFoo6 = new int[]{1, 5, 6, 2, 0, 100, 2, 99};
        arrayFoo7 = new int[]{5, 4, 3, 2, 1};
        arrayFoo8 = new int[]{1, 0, 1, 0, 1};
    }

    @Test
    void bubble() {
        sortUtils.bubble(arrayFoo1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arrayFoo1);

        sortUtils.bubble(arrayFoo2);
        Assertions.assertArrayEquals(new int[]{1, 1, 1, 1}, arrayFoo2);

        sortUtils.bubble(arrayFoo3);
        Assertions.assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, arrayFoo3);

        sortUtils.bubble(arrayFoo4);
        Assertions.assertArrayEquals(new int[]{}, arrayFoo4);

        sortUtils.bubble(arrayFoo5);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arrayFoo5);

        sortUtils.bubble(arrayFoo6);
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 2, 5, 6, 99, 100}, arrayFoo6);

        sortUtils.bubble(arrayFoo7);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arrayFoo7);

        sortUtils.bubble(arrayFoo8);
        Assertions.assertArrayEquals(new int[]{0,0,1,1,1}, arrayFoo8);



    }
}