package home_work_1;

/**
 * в классе реализован метод возвращающий sleep или work  в зависимомсти рабочий день или отпуск
 */
public class Task5 {
    public String sleepIn(boolean weekDay, boolean vacation) {
        if (vacation || !weekDay) {
            return "sleep";
        }
        return "work";
    }
}