package homeWork_5.camporator;

import homeWork_5.dto.Person;

import java.util.Comparator;

/**
 * класс для сравнения person  по длинне пароля и нику
 */
public class PersonComporatorLenghtAndNick implements Comparator<Person> {
    @Override
    public int compare(Person person, Person person2) {
        int result = Integer.compare(person.getPassword().length(), person2.getPassword().length());
        if (result != 0) {
            return result;
        } else {
            return person.getNick().compareTo(person2.getNick());
        }
    }
}
