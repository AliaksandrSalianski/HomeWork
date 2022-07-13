package home_work_1;

public class Task5 {
    public static void main(String[] args) {

    }

    public static void sleepIn(boolean weekDay, boolean vacation) {
        if (vacation || !weekDay) {
            System.out.println("<Sleep>");
        } else {
            System.out.println("Wake up!");
        }
    }
}