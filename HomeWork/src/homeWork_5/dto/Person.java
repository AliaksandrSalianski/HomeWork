package homeWork_5.dto;

public class Person {
    private final String nick;
    private final int password;
    private final String name;

    public Person(String nick, int password, String name) {
        this.nick = nick;
        this.password = password;
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public int getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    private static void chekingPassworld(String  str){

    }
}
