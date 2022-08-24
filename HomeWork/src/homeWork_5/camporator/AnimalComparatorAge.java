package homeWork_5.camporator;

import homeWork_5.dto.Animal;

import java.util.Comparator;

/**
 *
 */
public class AnimalComparatorAge implements Comparator<Animal> {
    @Override
    public int compare(Animal animal, Animal animal2) {
        return Integer.compare(animal.getAge(), animal2.getAge());

    }

}
