package homeWork_5.generation;

import homeWork_5.dto.Animal;
import homeWork_5.dto.Person;
import homeWork_5.dto.SomebodyWithNick;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * В классе реализованны методы получения рандомного возраста,рандомной строки состоящей из русских  символов,
 * рандомной строки состоящей из английских символов,арандомной строки состоящей из русских и английских символов а так же цифр,
 * рандомного реального имени,рандомной реальной клички,методы замера времени выполнения итерерирования,удаления и заполнения коллекций
 * имеет private поля класса:
 * LOWER_RUS_ALPHABET русский алфавит строчных букв
 * ALL_RUS_ALPHABET русский алфавит строчных и заглавных букв
 * LOWER_ENG_ALPHABET английский алфавит строчных букв
 * ALL_ENG_ALPHABET английский алфавит строчных и заглавных букв
 * NUMBER набор цифр от 0 до 9
 * String[] NAMES массив реальных имен
 * String[] NICKS массив реальных кличек
 *
 * @param <T> типизированный параметр данных
 */
public class GenerationMethods<T extends SomebodyWithNick> {
    private static final String LOWER_RUS_ALPHABET = " абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String ALL_RUS_ALPHABET = LOWER_RUS_ALPHABET + LOWER_RUS_ALPHABET.toUpperCase();

    private static final String LOWER_ENG_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String ALL_ENG_ALPHABET = LOWER_ENG_ALPHABET + LOWER_ENG_ALPHABET.toUpperCase();

    private static final String NUMBER = "0123456789";

    private static final String[] NAMES = {"Елисей", "Пантелеймон", "Святослав", "Ростислав", "Рафаэль", "Гордей", "Адам", "Оливер", "Патрик", "Никон", "Гавриил", "Аида", "Захра"};
    private static final String[] NICKS = {"Эйс", "Аксель", "Баки", "Бруно", "Харли", "Лола", "Рокси", "Виксен", "Дарман", "Цезарь", "Одиссей", "Эмир", "Анда", "Терра", "Эльба"};

    /**
     * Метод генерирует рандомное число от 0 до числа введеннго как параметр метода
     *
     * @param number верхняя граница рандомного числа, сама number в диапозон не включается
     * @return рандомное число
     */
    private static int getMeRandomNumber(int number) {

        return ThreadLocalRandom.current().nextInt(0, number);
    }

    /**
     * Метод гененирует рандомную строку из символов русского и (или) английскго алфавита и(или) цифр
     *
     * @param enteredStr var args параметр
     * @return рандомную строку
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
     * Метод для выбора английского,русского языков или цифр
     *
     * @param chooseRusAndEngOrNumber выбор языка
     * @return возвращает выбранный алфавит и(или) набор цифр
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

    public static String getRandomStringNoMatter() {
        return getMeRandomString("rus", "eng", "number");
    }

    /**
     * Метод выдает рандомно возраст от 1 до 15
     *
     * @return рандомный возраст
     */
    public static int getMeRandomAge() {
        return ThreadLocalRandom.current().nextInt(1, 16);
    }

    /**
     * Метод выдает рандомно реальное имя
     *
     * @return строку рандомного имя
     */
    public static String getMeRealRandomName() {
        return NAMES[getMeRandomNumber(NAMES.length)];
    }

    /**
     * Метод выдает рандомно реальную кличку
     *
     * @return строку рандомной клички
     */
    public static String getMeRealRandomNick() {
        return NICKS[getMeRandomNumber(NICKS.length)];
    }

    /**
     * Метод выдает рандомный пароль состоящий из русских и английских символов ,а так же цифр длинной от 5 до 10 символов
     *
     * @return строку рандомного пароля
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
     * Метод заполняет рандомно коллекцию 1 млн. обьектов Person и замеряет время
     *
     * @param myCollection коллекция которую заполняют
     * @return заполненнная колллекция
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
     * Метод заполняет рандомно коллекцию 1 млн. обьектов Animal и замеряет время
     *
     * @param myCollection коллекция которую заполняют
     * @return заполненнная колллекция
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
     * Метод замеряет время итерерирования по коллекции
     *
     * @param myCollection коллекция в которой измеряется время время итерирования при помощи Iterator
     * @param <T>          обобщенный типа данных
     */
    public static <T extends SomebodyWithNick> void timeIterationWithIterator(Collection<T> myCollection) {
        long start = System.currentTimeMillis();
        Iterator<T> iterator = myCollection.iterator();
        int foo = 0;
        while (iterator.hasNext()) {
            iterator.next();
        }
        System.out.println("elements in collection = " + foo);
        long finish = System.currentTimeMillis();
        System.out.println("Операция:  Итерирования коллекции " + myCollection.getClass() + ". Заняла " + (finish - start) + "мс");

    }

    /**
     * Метод замеряет время итерерирования по коллекции
     *
     * @param myCollection коллекция в которой измеряется время итерирования при помощи for
     * @param <T>          обобщенный типа данных
     */
    public static <T extends SomebodyWithNick> void timeIterationWithFor(Collection<T> myCollection) {
        long start = System.currentTimeMillis();
        long fooCount = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            fooCount++;
        }
        System.out.println("elements in collection = " + fooCount);
        long finish = System.currentTimeMillis();
        System.out.println("Операция:  Итерирования коллекции " + myCollection.getClass() + ". Заняла " + (finish - start) + "мс");
    }

    /**
     * метод замеряет время выполнения операции очистки коллекции
     *
     * @param myCollection коллекция в которой измеряется время удаления всех элементов
     * @param <T>          обобщенный типа данных
     */
    public static <T extends SomebodyWithNick> void timeDeleteCollection(Collection<T> myCollection) {
        long start = System.currentTimeMillis();
        myCollection.clear();
        long finish = System.currentTimeMillis();
        System.out.println("Операция:  Удаление коллекции " + myCollection.getClass() + ". Заняла " + (finish - start) + "мс");
    }


}
