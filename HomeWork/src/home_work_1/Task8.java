package home_work_1;

public class Task8 {
    //   Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное представление числа. В методе можно использовать только обычную математику которая описана в теории.
    //   Если число отрицательное то вернуть дополнительный код. Теория https://planetcalc.ru/747. Пример:
    //           8.1 Вводим: 42.  Возвращает: 00101010
    //           8.2 Вводим: 15.  Возвращает: 00001111
    //           8.3 Вводим: -42. Возвращает: 11010110
    //           8.4 Вводим: -15. Возвращает: 11110001
    public static String toBinaryString(byte number) {
        if (number > 0) return makeBinaryIfPositive(number);// если вводимое число > 0
        else return makeBinaryIfNegative(number);// если вводимое число < 0
    }

    private static String makeBinaryIfPositive(byte number) {
        String result = "";
        int[] arrayWithZero = new int[8];
        int flagIndexInArray = arrayWithZero.length - 1;
        while (number != 0) {
            arrayWithZero[flagIndexInArray] = (number % 2);
            number /= 2;
            flagIndexInArray--;
        }
        for (int n : arrayWithZero) {
            result += n;
        }
        return result;
    }

    private static String makeBinaryIfNegative(byte number) {
        number *= -1;
        String str = makeBinaryIfPositive(number);
        char[] arrayOfChar = str.toCharArray();
        for (int i = 0; i < arrayOfChar.length; i++) {
            if (arrayOfChar[i] == '0') {
                arrayOfChar[i] = '1';
            } else {
                arrayOfChar[i] = '0';
            }
        }
        return String.valueOf(arrayOfChar);
    }
}


