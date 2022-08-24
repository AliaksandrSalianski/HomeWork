package homeWork_5.dto;

/**
 * обстрактный класс родитель animal и person
 * имеет поле
 * nick имя
 */
public abstract class SomebodyWithNick {
    public String nick;

    public String getNick() {
        return nick;
    }

    public SomebodyWithNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return
                " nick='" + nick + '\'' +
                        '}';
    }
}
