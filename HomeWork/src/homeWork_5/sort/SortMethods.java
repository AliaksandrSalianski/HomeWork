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
     * @param animalList
     */
    public static void sortListCollectionOfAnimalByAge(List<Animal> animalList) {
        animalList.sort(new AnimalComparatorAge());
    }

    /**
     * @param animalList
     */
    public static void sortListOfAnimalByAgeAndNick(List<Animal> animalList) {
        animalList.sort(new AnimalComparatorAgeAndNick());
    }

    /**
     * @param animalSet
     */
    public static void sortSetCollectionOfAnimalByAge(Set<Animal> animalSet) {
        List<Animal> sortedList = new ArrayList<>(animalSet);
        sortListCollectionOfAnimalByAge(sortedList);

    }

    /**
     * @param animalSet
     */
    public static void sortSetCollectionOfAnimalByAgeAndNick(Set<Animal> animalSet) {
        List<Animal> sortedList = new ArrayList<>(animalSet);
        sortListOfAnimalByAgeAndNick(sortedList);

    }

    /**
     * @param personList
     */
    public static void sortListCollectionOfPersonByLengthPassword(List<Person> personList) {
        personList.sort(new PersonComparatorLengthPassword());
    }

    /**
     * @param personList
     */
    public static void sortListCollectionOfPersonByLengthPasswordAndNick(List<Person> personList) {
        personList.sort(new PersonComporatorLenghtAndNick());
    }

    /**
     * @param personList
     */
    public static void sortSetCollectionOfPersonByLengthPassword(Set<Person> personList) {
        List<Person> sortedList = new ArrayList<>(personList);
        sortListCollectionOfPersonByLengthPassword(sortedList);

    }

    /**
     * @param personList
     */
    public static void sortSetCollectionOfPersonByLengthPasswordAndNick(Set<Person> personList) {
        List<Person> sortedList = new ArrayList<>(personList);
        sortListCollectionOfPersonByLengthPasswordAndNick(sortedList);

    }
}
