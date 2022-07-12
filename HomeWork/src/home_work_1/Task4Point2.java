package home_work_1;

public class Task4Point2 {
    public static int findTheAverage(int one, int two, int three) {
        int max = Math.max(three, Math.max(one, two)); //find "max" number
        int min = Math.min(three, Math.min(one, two)); //find "min" number
        return one + two + three - max - min; // average number
    }
}
