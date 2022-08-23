package homeWork_5.dto;

import homeWork_5.IDoIt;

public class Person extends SomebodyWithNick implements Comparable<Person> {
    private final String password;
    private final String name;

    public Person(String nick, String password, String name) {
        super(nick);
        this.password = password;
        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password=" + password +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Person person) {
        int personHash = person.hashCode();
        return this.hashCode() - personHash;
    }
}
