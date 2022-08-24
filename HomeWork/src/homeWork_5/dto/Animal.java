package homeWork_5.dto;

/**
 * класс являтся наследником SomebodyWithNick
 * имеет поля :
 * age возраст
 */
public class Animal extends SomebodyWithNick implements Comparable<Animal> {
    private int age;

    /**
     * Конструктор
     *
     * @param nick ник
     * @param age  возраст
     */
    public Animal(String nick, int age) {
        super(nick);
        setAge(age);
    }

    /**
     * Метод проверяет правильность ввода возраста
     *
     * @param age возраст
     */
    private void setAge(int age) {
        if (age < 1 || age > 15) {
            throw new IllegalArgumentException("age can be < 1 and >15 ");
        } else {
            this.age = age;
        }

    }

    /**
     * геттер
     *
     * @return возвращает возраст
     */
    public int getAge() {
        return age;
    }

    /**
     * геттер
     *
     * @return возвращает ник
     */
    public String getNick() {
        return nick;
    }

    /**
     * Переопределенный toString
     *
     * @return возвращает строку
     */
    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                super.toString();
    }

    /**
     * переопределлленный метод для treeSet
     *
     * @param animal обьект person
     * @return возвращает разность между хеш кодами двух обьектов
     */
    @Override
    public int compareTo(Animal animal) {
        return this.hashCode() - animal.hashCode();
    }
}

