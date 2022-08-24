package homeWork_5.runner;

import homeWork_5.generation.GenerationMethods;
import homeWork_5.dto.Animal;
import homeWork_5.dto.Person;
import homeWork_5.sort.SortMethods;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(" Animal ");
        System.out.println(" ");

        List<Animal> listOfAnimalLinked = new LinkedList<>();
        List<Animal> listOfAnimalArray = new ArrayList<>();
        Set<Animal> setOfAnimalHashSet = new HashSet<>();
        SortedSet<Animal> setOfAnimalTreeSet = new TreeSet<>();
        System.out.println("<<<<<<<Add_1_millionRandomElementsInCollectionAnimal>>>>>");
        GenerationMethods.addInCollectionAnimal(listOfAnimalLinked);
        GenerationMethods.addInCollectionAnimal(listOfAnimalArray);
        GenerationMethods.addInCollectionAnimal(setOfAnimalHashSet);
        GenerationMethods.addInCollectionAnimal(setOfAnimalTreeSet);
        System.out.println("<<<<<<<<<Sort All Collections Animal by age>>>>>>>>>>>>>>>");
        SortMethods.sortListCollectionOfAnimalByAge(listOfAnimalLinked);
        SortMethods.sortListCollectionOfAnimalByAge(listOfAnimalArray);
        SortMethods.sortSetCollectionOfAnimalByAge(setOfAnimalHashSet);
        SortMethods.sortSetCollectionOfAnimalByAge(setOfAnimalTreeSet);
        System.out.println("<<<<<<<<<Sort All Collections Animal by age and nick>>>>>>");
        SortMethods.sortListCollectionOfAnimalByAge(listOfAnimalLinked);
        SortMethods.sortListCollectionOfAnimalByAge(listOfAnimalArray);
        SortMethods.sortSetCollectionOfAnimalByAgeAndNick(setOfAnimalHashSet);
        SortMethods.sortSetCollectionOfAnimalByAgeAndNick(setOfAnimalTreeSet);
        System.out.println("<<<<<<<<<Time Iteration on All Collections Animal with For >>>>>>>>");
        GenerationMethods.timeIterationWithFor(listOfAnimalLinked);
        GenerationMethods.timeIterationWithFor(listOfAnimalArray);
        GenerationMethods.timeIterationWithFor(setOfAnimalHashSet);
        GenerationMethods.timeIterationWithFor(setOfAnimalTreeSet);
        System.out.println("<<<<<<<<<Time Iteration on All Collections Animal with Iterator >>>>>>>>");
        GenerationMethods.timeIterationWithIterator(listOfAnimalLinked);
        GenerationMethods.timeIterationWithIterator(listOfAnimalArray);
        GenerationMethods.timeIterationWithIterator(setOfAnimalHashSet);
        GenerationMethods.timeIterationWithIterator(setOfAnimalTreeSet);
        System.out.println("<<<<<<<<<Time Delete on All Collections Animal>>>>>>>>");
        GenerationMethods.timeDeleteCollection(listOfAnimalLinked);
        GenerationMethods.timeDeleteCollection(listOfAnimalArray);
        GenerationMethods.timeDeleteCollection(setOfAnimalHashSet);
        GenerationMethods.timeDeleteCollection(setOfAnimalTreeSet);

        System.out.println(" ");
        System.out.println("person");
        System.out.println(" ");

        List<Person> listOfPersonLinked = new LinkedList<>();
        List<Person> listOfPersonArray = new ArrayList<>();
        Set<Person> setOfPersonHashSet = new HashSet<>();
        SortedSet<Person> setOfPersonTreeSet = new TreeSet<>();

        System.out.println("<<<<<<<Add_1_millionRandomElementsInCollectionPerson>>>>>");
        GenerationMethods.addInCollectionPerson(listOfPersonLinked);
        GenerationMethods.addInCollectionPerson(listOfPersonArray);
        GenerationMethods.addInCollectionPerson(setOfPersonHashSet);
        GenerationMethods.addInCollectionPerson(setOfPersonTreeSet);
        System.out.println("<<<<<<<<<Sort All Collections Person by Length Password>>>>>>>>>>>>>>>");

        SortMethods.sortListCollectionOfPersonByLengthPassword(listOfPersonLinked);
        SortMethods.sortListCollectionOfPersonByLengthPassword(listOfPersonArray);
        SortMethods.sortSetCollectionOfPersonByLengthPassword(setOfPersonHashSet);
        SortMethods.sortSetCollectionOfPersonByLengthPassword(setOfPersonTreeSet);
        System.out.println("<<<<<<<<<Sort All Collections Animal by Age and Nick>>>>>>");

        SortMethods.sortListCollectionOfPersonByLengthPasswordAndNick(listOfPersonLinked);
        SortMethods.sortListCollectionOfPersonByLengthPasswordAndNick(listOfPersonArray);
        SortMethods.sortSetCollectionOfPersonByLengthPasswordAndNick(setOfPersonHashSet);
        SortMethods.sortSetCollectionOfPersonByLengthPasswordAndNick(setOfPersonTreeSet);

        System.out.println("<<<<<<<<<Time Iteration on All Collections Person with For >>>>>>>>");
        GenerationMethods.timeIterationWithFor(listOfPersonLinked);
        GenerationMethods.timeIterationWithFor(listOfPersonArray);
        GenerationMethods.timeIterationWithFor(setOfPersonHashSet);
        GenerationMethods.timeIterationWithFor(setOfPersonTreeSet);

        System.out.println("<<<<<<<<<Time Iteration on All Collections Person with Iterator >>>>>>>>");
        GenerationMethods.timeIterationWithIterator(listOfPersonLinked);
        GenerationMethods.timeIterationWithIterator(listOfPersonArray);
        GenerationMethods.timeIterationWithIterator(setOfPersonHashSet);
        GenerationMethods.timeIterationWithIterator(setOfPersonTreeSet);

        System.out.println("<<<<<<<<<Time Delete on All Collections Person>>>>>>>>");
        GenerationMethods.timeDeleteCollection(listOfPersonLinked);
        GenerationMethods.timeDeleteCollection(listOfPersonArray);
        GenerationMethods.timeDeleteCollection(setOfPersonHashSet);
        GenerationMethods.timeDeleteCollection(setOfPersonTreeSet);
    }
}
