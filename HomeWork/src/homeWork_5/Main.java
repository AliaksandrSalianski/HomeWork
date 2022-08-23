package homeWork_5;

import homeWork_5.camporator.AnimalCamporatorAge;
import homeWork_5.dto.Animal;
import homeWork_5.dto.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> listOfPersonLinked = new LinkedList<>();
        List<Person> listOfPersonArray = new ArrayList<>();
        Set<Person> setOfPersonHashSet = new HashSet<>();
        SortedSet<Person> setOfPersonTreeSet = new TreeSet<>();

        List<Animal> listOfAnimalLinked = new LinkedList<>();
        List<Animal> listOfAnimalArray = new ArrayList<>();
        Set<Animal> setOfAnimalHashSet = new HashSet<>();
        SortedSet<Animal> setOfAnimalTreeSet = new TreeSet<>();

        System.out.println("<<<<<<<<<AddInCollectionAnimalRandom>>>>>>>>>>>>>>>>");
        GenerationMethods.addInCollectionAnimal(listOfAnimalLinked);
        GenerationMethods.addInCollectionAnimal(listOfAnimalArray);
        GenerationMethods.addInCollectionAnimal(setOfAnimalHashSet);
        GenerationMethods.addInCollectionAnimal(setOfAnimalTreeSet);

        System.out.println("<<<<<<<<<AddInCollectionPersonRandom>>>>>>>>>>>>>>>>");
        GenerationMethods.addInCollectionPerson(listOfPersonLinked);
        GenerationMethods.addInCollectionPerson(listOfPersonArray);
        GenerationMethods.addInCollectionPerson(setOfPersonHashSet);
        GenerationMethods.addInCollectionPerson(setOfPersonTreeSet);

        System.out.println("<<<<<<<<<<<<<Time Iteration with Iterator>>>>>>>>>>>>>>>>>");
        GenerationMethods.timeIterationWithIterator(listOfAnimalLinked);
        GenerationMethods.timeIterationWithIterator(listOfPersonLinked);

        GenerationMethods.timeIterationWithIterator(listOfAnimalArray);
        GenerationMethods.timeIterationWithIterator(listOfPersonArray);

        GenerationMethods.timeIterationWithIterator(setOfAnimalHashSet);
        GenerationMethods.timeIterationWithIterator(setOfPersonHashSet);

        GenerationMethods.timeIterationWithIterator(setOfAnimalTreeSet);
        GenerationMethods.timeIterationWithIterator(setOfPersonTreeSet);

        System.out.println("<<<<<<<<<<<<<Time Iteration with For>>>>>>>>>>>>>>>>>");
        GenerationMethods.timeIterationWithFor(listOfAnimalLinked);
        GenerationMethods.timeIterationWithFor(listOfPersonLinked);

        GenerationMethods.timeIterationWithFor(listOfAnimalArray);
        GenerationMethods.timeIterationWithFor(listOfPersonArray);

        GenerationMethods.timeIterationWithFor(setOfAnimalHashSet);
        GenerationMethods.timeIterationWithFor(setOfPersonHashSet);

        GenerationMethods.timeIterationWithFor(setOfAnimalTreeSet);
        GenerationMethods.timeIterationWithFor(setOfPersonTreeSet);

        GenerationMethods.addInCollectionUniversal(listOfPersonLinked);
        GenerationMethods.addInCollectionUniversal(listOfAnimalLinked);
    }
}
