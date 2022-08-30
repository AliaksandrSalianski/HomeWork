package home_work_1;

import home_work_1.interfaces.ICommunicationPrinter;

/**
 * класс реализует интерфейс ICommunicationPrinter. В зависимоти от имени и конструкции "switch" возвращает приведствие
 */
public class Task6Part3 implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        switch (name) {
            case ("Вася"):
                return "Привет!";
            case ("Анастасия"):
                return "Я тебя так долго ждал";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}

