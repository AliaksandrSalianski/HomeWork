package homeWork_5.camporator;

import homeWork_5.dto.Animal;

import java.util.Comparator;

/**
 * класс для сравненияя по возрасту и нику  обьектов animal
 */

public class AnimalComparatorAgeAndNick implements Comparator<Animal> {
    @Override
    public int compare(Animal animal, Animal animal2) {
        int result = Integer.compare(animal.getAge(), animal2.getAge());
        if (result != 0) {
            return result;
        } else {
            return animal.getNick().compareTo(animal2.getNick());
        }
    }
}
