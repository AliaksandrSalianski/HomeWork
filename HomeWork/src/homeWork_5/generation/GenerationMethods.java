package homeWork_5.generation;

import homeWork_5.camporator.AnimalComparatorAge;
import homeWork_5.camporator.AnimalComparatorAgeAndNick;
import homeWork_5.dto.Animal;
import homeWork_5.dto.Person;
import homeWork_5.dto.SomebodyWithNick;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GenerationMethods<T extends SomebodyWithNick> {
    private static final String LOWER_RUS_ALPHABET = " абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String ALL_RUS_ALPHABET = LOWER_RUS_ALPHABET + LOWER_RUS_ALPHABET.toUpperCase();

    private static final String LOWER_ENG_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String ALL_ENG_ALPHABET = LOWER_ENG_ALPHABET + LOWER_ENG_ALPHABET.toUpperCase();

    private static final String NUMBER = "0123456789";

    private static final String[] NAMES = {"Елисей", "Пантелеймон", "Святослав", "Ростислав", "Рафаэль", "Гордей", "Адам", "Оливер", "Патрик", "Никон", "Гавриил", "Аида", "Захра"};
    private static final String[] NICKS = {"Эйс", "Аксель", "Баки", "Бруно", "Харли", "Лола", "Рокси", "Виксен", "Дарман", "Цезарь", "Одиссей", "Эмир", "Анда", "Терра", "Эльба"};
    private Collection<T> collection;

    /**
     * @param number
     * @return
     */
    private static int getMeRandomNumber(int number) {

        return ThreadLocalRandom.current().nextInt(0, number);
    }

    /**
     * @param enteredStr
     * @return
     */
    private static String getMeRandomString(String... enteredStr) {
        StringBuilder str = new StringBuilder();
        for (String s : enteredStr) {
            str.append(chooseLanguage(s));
        }
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        int interval = ThreadLocalRandom.current().nextInt(1, 100);
        for (int i = 0; i <= getMeRandomNumber(interval); i++) {
            int number = random.nextInt(str.length());
            result.append(str.charAt(number));
        }
        return result.toString();
    }

    /**
     * @param chooseRusAndEngOrNumber
     * @return
     */
    private static String chooseLanguage(String chooseRusAndEngOrNumber) {
        if (chooseRusAndEngOrNumber.equalsIgnoreCase("rus")) {
            return ALL_RUS_ALPHABET;
        } else if (chooseRusAndEngOrNumber.equalsIgnoreCase("eng")) {
            return ALL_ENG_ALPHABET;
        } else if (chooseRusAndEngOrNumber.equalsIgnoreCase("number")) {
            return NUMBER;
        } else {
            return "";
        }

    }

    /**
     * @return
     */
    public static String getRandomStringRus() {
        return getMeRandomString("rus");

    }

    /**
     * @return
     */
    public static String getRandomStringNoMatter() {
        return getMeRandomString("rus", "eng", "number");
    }

    /**
     * @return
     */
    public static String getRandomRusString() {
        return getMeRandomString("rus");
    }

    /**
     * @return
     */
    public static String getRandomEngString() {
        return getMeRandomString("eng");
    }

    /**
     * @return
     */
    public static int getMeRandomAge() {
        return ThreadLocalRandom.current().nextInt(1, 16);
    }

    /**
     * @return
     */
    public static String getMeRealRandomName() {
        return NAMES[getMeRandomNumber(NAMES.length)];
    }

    /**
     * @return
     */
    public static String getMeRealRandomNick() {
        return NICKS[getMeRandomNumber(NICKS.length)];
    }

    /**
     * @return
     */
    public static String getMeRandomPassword() {
        String foo = ALL_ENG_ALPHABET + NUMBER + ALL_RUS_ALPHABET;
        int randomSizeOfPassword = ThreadLocalRandom.current().nextInt(5, 10);
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i <= randomSizeOfPassword; i++) {
            int number = random.nextInt(foo.length());
            result.append(foo.charAt(number));
        }
        return result.toString();
    }

    /**
     * @param myCollection
     * @return
     */
    public static Collection<Person> addInCollectionPerson(Collection<Person> myCollection) {
        long start = System.currentTimeMillis();
        int fooCount = 0;
        while (fooCount != 1_000_000) {
            myCollection.add(new Person(GenerationMethods.getMeRealRandomNick(), GenerationMethods.getMeRandomPassword(), getMeRealRandomName()));
            fooCount++;
        }
        long finish = System.currentTimeMillis();
        System.out.println("Операция:  Заполнения коллекции " + myCollection.getClass() + ". Заняла " + (finish - start) + "мс");
        return myCollection;
    }

    /**
     * @param myCollection
     * @return
     */
    public static Collection<Animal> addInCollectionAnimal(Collection<Animal> myCollection) {
        long start = System.currentTimeMillis();
        int fooCount = 0;
        while (fooCount != 1_000_000) {
            myCollection.add(new Animal(GenerationMethods.getRandomStringNoMatter(), getMeRandomAge()));
            fooCount++;
        }
        long finish = System.currentTimeMillis();
        System.out.println("Операция:  Заполнения коллекции " + myCollection.getClass() + ". Заняла " + (finish - start) + "мс");
        return myCollection;
    }

    /**
     * @param myCollection
     * @param <T>
     */
    public static <T extends SomebodyWithNick> void timeIterationWithIterator(Collection<T> myCollection) {
        long start = System.currentTimeMillis();
        Iterator<T> iterator = myCollection.iterator();
        int foo = 0;
        while (iterator.hasNext()) {
            foo++;
            iterator.next();
        }
        long finish = System.currentTimeMillis();
        System.out.println("Операция:  Итерирования коллекции " + myCollection.getClass() + ". Заняла " + (finish - start) + "мс");

    }

    /**
     * @param myCollection
     * @param <T>
     */
    public static <T extends SomebodyWithNick> void timeIterationWithFor(Collection<T> myCollection) {
        long start = System.currentTimeMillis();
        long fooCount = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            fooCount++;
        }
        long finish = System.currentTimeMillis();
        System.out.println("Операция:  Итерирования коллекции " + myCollection.getClass() + ". Заняла " + (finish - start) + "мс");
    }

    /**
     * @param myCollection
     * @param <T>
     */
    public static <T extends SomebodyWithNick> void timeDeleteCollection(Collection<T> myCollection) {
        long start = System.currentTimeMillis();
        myCollection.clear();
        long finish = System.currentTimeMillis();
        System.out.println("Операция:  Удаление коллекции " + myCollection.getClass() + ". Заняла " + (finish - start) + "мс");
    }

    /**
     * @param myCollection
     * @param <T>
     * @return
     */
// нужно доработать!!!!!
    //  public static <T extends SomebodyWithNick> Collection<T> addInCollectionUniversal(Collection<T> myCollection) {
    //      long start = System.currentTimeMillis();
    //      T my = (T) new Object();
    //      Object o = new Object();
    //      int fooCount = 0;
    //      if (my instanceof Person)) {
    //          while (fooCount != 100) {
    //              myCollection.add((T) new Animal(GenerationMethods.getRandomStringNoMatter(), getMeRandomAge()));
    //              fooCount++;
//
    //          }
    //          return myCollection;
    //      } else {
    //          while (fooCount != 100) {
    //              myCollection.add((T) new Person(GenerationMethods.getMeRealRandomNick(), GenerationMethods.getMeRandomPassword(), getMeRealRandomName()));
    //              fooCount++;
    //          }
    //      }
    //      long finish = System.currentTimeMillis();
    //      System.out.println("Операция:  Заполнения коллекции " + myCollection.getClass() + ". Заняла " + (finish - start) + "мс");
    //      return myCollection;
}
