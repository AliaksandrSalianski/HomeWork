package homeWork_5.camporator;

import homeWork_5.dto.Person;

import java.util.Comparator;

public class PersonComparatorLengthPassword implements Comparator<Person> {
    @Override
    public int compare(Person person, Person person2) {
        return Integer.compare(person.getPassword().length(), person2.getPassword().length());
    }
}
