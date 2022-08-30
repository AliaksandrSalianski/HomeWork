package home_work_1;

/**
 * класс реализует поиск среденго числа по значению из трех чисел
 */
public class Task4Part2 {
    public int findTheAverage(int one, int two, int three) {
        int max = Math.max(three, Math.max(one, two));
        int min = Math.min(three, Math.min(one, two));
        return one + two + three - max - min;
    }
}
