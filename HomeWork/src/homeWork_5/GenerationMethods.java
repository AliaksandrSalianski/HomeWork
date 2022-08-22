package homeWork_5;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerationMethods {
    private static final String LOWER_RUS_ALPHABET = " абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String ALL_RUS_ALPHABET = LOWER_RUS_ALPHABET + LOWER_RUS_ALPHABET.toUpperCase();

    private static final String LOWER_ENG_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String ALL_ENG_ALPHABET = LOWER_ENG_ALPHABET + LOWER_ENG_ALPHABET.toUpperCase();

    private static final String NUMBER = "0123456789";

    private static final String[] NAMES = {"Елисей", "Пантелеймон", "Святослав", "Ростислав", "Рафаэль", "Гордей", "Адам", "Оливер", "Патрик", "Никон", "Гавриил", "Аида", "Захра"};
    private static final String[] NICKNAMES = {"Эйс", "Аксель", "Баки", "Бруно", "Харли", "Лола", "Рокси", "Виксен", "Дарман", "Цезарь", "Одиссей", "Эмир", "Анда", "Терра", "Эльба"};

    /**
     *
     * @param number
     * @return
     */
    private static int getMeRandomNumber(int number) {

        return ThreadLocalRandom.current().nextInt(0, number);
    }

    /**
     *
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
        int interval = ThreadLocalRandom.current().nextInt(0, 100);
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
        } else if  (chooseRusAndEngOrNumber.equalsIgnoreCase("number")){
            return NUMBER;
        }else {
            return "";
        }

    }

    /**
     *
     * @return
     */
    public static String getRandomStringRus() {
        return getMeRandomString("rus");

    }

    /**
     *
     * @return
     */
    public static String getRandomStringNoMatter() {
        return getMeRandomString("rus", "eng", "number");
    }

    /**
     *
     * @return
     */
    public static String getMeRandomName() {
        return NAMES[getMeRandomNumber(NAMES.length)];
    }

    /**
     *
     * @return
     */
    public static String getMeRandomNickname() {
        return NICKNAMES[getMeRandomNumber(NICKNAMES.length)];
    }
}