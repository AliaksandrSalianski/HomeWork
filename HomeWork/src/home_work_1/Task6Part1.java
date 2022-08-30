package home_work_1;

import home_work_1.interfaces.ICommunicationPrinter;

import java.util.Objects;

/**
 * класс реализует интерфейс ICommunicationPrinter. В зависимоти от имени и конструкции if возвращает приведствие
 */
public class Task6Part1 implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        if (Objects.equals(name, "Вася")) {
            return "Привет!";
        }
        if (Objects.equals(name, "Анастасия")) {
            return "Я тебя так долго ждал";
        }
        if (!Objects.equals(name, "Вася") && !Objects.equals(name, "Анастасия")) {
            return "Добрый день, а вы кто?";
        }
        return"wrong input";
    }
}