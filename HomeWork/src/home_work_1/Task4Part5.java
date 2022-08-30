package home_work_1;

/**
 * В классе реализована проверка по вводимому числу обозначающего код символа в таблицы ASCII является ли символ буквой англмйского алфавита
 */
public class Task4Part5 {

    public String defineEngChar(int number) {
        if ((number >= 65 && number <= 90) || (number >= 97 && number <= 122)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}