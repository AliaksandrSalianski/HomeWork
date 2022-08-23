package homeWork_5.dto;

public abstract class SomebodyWithNick {
    public String nick;

    public String getNick() {
        return nick;
    }

    protected void setNick(String nick) {
        this.nick = nick;
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
