package home_work_1;

public class Task4Point2 {
    public static int findTheAverage(int one, int two, int three) {
        int max = Math.max(three, Math.max(one, two));
        int min = Math.min(three, Math.min(one, two));
        return one + two + three - max - min;
    }
}
