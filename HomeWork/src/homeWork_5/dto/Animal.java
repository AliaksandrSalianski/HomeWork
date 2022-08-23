package homeWork_5.dto;

import homeWork_5.camporator.AnimalCamporatorAge;
import homeWork_5.camporator.AnimalComparatorAgeAndNick;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Animal extends SomebodyWithNick implements Comparable<Animal> {
    private final int age;

    public Animal(String nick, int age) {
        super(nick);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    /**
     * @return
     */
    public static int getMeRandomAge() {
        return ThreadLocalRandom.current().nextInt(1, 16);
    }

    /**
     * @param animalList
     */
    public static void sortCollectionOfAnimalByAge(List<Animal> animalList) {
        animalList.sort(new AnimalCamporatorAge());
    }

    /**
     * @param animalList
     */
    public void sortCollectionOfAnimalByAgeAndNick(List<Animal> animalList) {
        animalList.sort(new AnimalComparatorAgeAndNick());
    }


    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                super.toString();
    }

    @Override
    public int compareTo(Animal animal) {
        int personHash = animal.hashCode();
        return this.hashCode() - personHash;
    }
}

