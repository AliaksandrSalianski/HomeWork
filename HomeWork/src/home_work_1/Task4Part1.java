package home_work_1;

/**
 * в классе реализован метод проверки четное число или нечетное. если число нечетное то возвращает ближайшее четное
 */
public class Task4Part1 {
    public int checkHonest(int one) {
        if (one == 0) {
            return 2;
        } else if (one % 2 == 0) {
            return one;
        } else {
            return one + 1;
        }
    }
}

