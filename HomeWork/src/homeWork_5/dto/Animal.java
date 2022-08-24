package homeWork_5.dto;

import homeWork_5.camporator.AnimalComparatorAge;
import homeWork_5.camporator.AnimalComparatorAgeAndNick;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Animal extends SomebodyWithNick implements Comparable<Animal> {
    private int age;

    public Animal(String nick, int age) {
        super(nick);
        setAge(age);
    }

    private void setAge(int age) {
        if (age < 1 || age > 15) {
            throw new IllegalArgumentException("age can be < 1 and >15 ");
        } else {
            this.age = age;
        }

    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }




    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                super.toString();
    }

    @Override
    public int compareTo(Animal animal) {
        return this.hashCode() - animal.hashCode();
    }
}

