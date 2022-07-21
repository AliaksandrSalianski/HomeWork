package homeWork_2.loops;

public class Loop6 {
    /**
     * выводит таблицу умножения в консоль при помощи двух циклов
     */

    public static void displayMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
            }
            System.out.println("");
        }
        System.out.println("...............................................");
        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
            }
            System.out.println("");
        }
    }
}

