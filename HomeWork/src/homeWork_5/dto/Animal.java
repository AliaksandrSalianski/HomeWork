package homeWork_5.dto;

public class Animal {
    private int age;
    private String nick;

    public void setAge(int age) {
        if (age > 1 && age < 15) {
            this.age = age;
        } else {

        }
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

}

