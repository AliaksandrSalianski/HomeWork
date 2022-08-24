package homeWork_5.sort;

import homeWork_5.camporator.AnimalComparatorAge;
import homeWork_5.camporator.AnimalComparatorAgeAndNick;
import homeWork_5.camporator.PersonComparatorLengthPassword;
import homeWork_5.camporator.PersonComporatorLenghtAndNick;
import homeWork_5.dto.Animal;
import homeWork_5.dto.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SortMethods {
    /**
     * Метод сортирует List по возрасту
     *
     * @param animalList коллекция обьектов Person
     */
    public static void sortListCollectionOfAnimalByAge(List<Animal> animalList) {
        animalList.sort(new AnimalComparatorAge());
    }

    /**
     * Метод сортирует List по возрасту и нику
     *
     * @param animalList коллекция обьектов Person
     */
    public static void sortListOfAnimalByAgeAndNick(List<Animal> animalList) {
        animalList.sort(new AnimalComparatorAgeAndNick());
    }

    /**
     * Метод сортирует Set по возрасту
     *
     * @param animalSet коллекция обьектов Person
     */
    public static void sortSetCollectionOfAnimalByAge(Set<Animal> animalSet) {
        List<Animal> sortedList = new ArrayList<>(animalSet);
        sortListCollectionOfAnimalByAge(sortedList);

    }

    /**
     * Метод сортирует Set по возрасту и нику
     *
     * @param animalSet коллекция обьектов Person
     */
    public static void sortSetCollectionOfAnimalByAgeAndNick(Set<Animal> animalSet) {
        List<Animal> sortedList = new ArrayList<>(animalSet);
        sortListOfAnimalByAgeAndNick(sortedList);

    }

    /**
     * Метод сортирует List по длинне пароля
     *
     * @param personList коллекция обьектов Person
     */
    public static void sortListCollectionOfPersonByLengthPassword(List<Person> personList) {
        personList.sort(new PersonComparatorLengthPassword());
    }

    /**
     * Метод сортирует List по длинне пароля и нику
     *
     * @param personList коллекция обьектов Person
     */
    public static void sortListCollectionOfPersonByLengthPasswordAndNick(List<Person> personList) {
        personList.sort(new PersonComporatorLenghtAndNick());
    }

    /**
     * Метод сортирует Set по длинне пароля
     *
     * @param personList коллекция обьектов Person
     */
    public static void sortSetCollectionOfPersonByLengthPassword(Set<Person> personList) {
        List<Person> sortedList = new ArrayList<>(personList);
        sortListCollectionOfPersonByLengthPassword(sortedList);

    }

    /**
     * Метод сортирует Set по длинне пароля и нику
     *
     * @param personList коллекция обьектов Person
     */
    public static void sortSetCollectionOfPersonByLengthPasswordAndNick(Set<Person> personList) {
        List<Person> sortedList = new ArrayList<>(personList);
        sortListCollectionOfPersonByLengthPasswordAndNick(sortedList);

    }
}
