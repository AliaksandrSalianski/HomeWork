package homeWork_5.dto;

/**
 * класс являтся наследником SomebodyWithNick
 * имеет поля :
 * password пароль
 * name имя
 */
public class Person extends SomebodyWithNick implements Comparable<Person> {
    private String password;
    private final String name;

    /**
     * Конструктор
     *
     * @param nick     псевдоним пользователя
     * @param password пароль
     * @param name     имя
     */
    public Person(String nick, String password, String name) {
        super(nick);
        setPassword(password);
        this.name = name;
    }

    /**
     * метод проверяет правильность ввода пароля
     *
     * @param password возвращает проверенный пароль
     */
    private void setPassword(String password) {
        if (password.length() < 5 || password.length() > 10) {
            throw new IllegalArgumentException(" password length cant be < 5 and > 10 ");
        } else {
            this.password = password;
        }
    }

    /**
     * Геттер
     *
     * @return пароль
     */
    public String getPassword() {
        return password;
    }


    /**
     * Переопределенный toString
     *
     * @return возвращает строку
     */
    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password=" + password +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * переопределлленный метод для treeSet
     *
     * @param person обьект person
     * @return возвращает разность между хеш кодами двух обьектов
     */
    @Override
    public int compareTo(Person person) {
        return this.hashCode() - person.hashCode();
    }
}
