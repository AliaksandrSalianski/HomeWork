package homeWork_5.dto;

/**
 *
 */
public class Person extends SomebodyWithNick implements Comparable<Person> {
    private String password;
    private final String name;

    /**
     * @param nick
     * @param password
     * @param name
     */
    public Person(String nick, String password, String name) {
        super(nick);
        setPassword(password);
        this.name = name;
    }

    /**
     * @param password
     */
    private void setPassword(String password) {
        if (password.length() < 5 || password.length() > 10) {
            throw new IllegalArgumentException(" password length cant be < 5 and > 10 ");
        } else {
            this.password = password;
        }
    }

    /**
     * @return
     */
    public String getPassword() {
        return password;
    }


    /**
     * @return
     */
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
        return this.hashCode() - person.hashCode();
    }
}
