package home_work_1;

/**
 * в классе реализована проверка является ли год высокосным
 */

public class Task4Part6 {

    public String leapYear(int enterYear) {
        if ((enterYear % 4 == 0 && enterYear % 100 != 0) || (enterYear % 400 == 0)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
