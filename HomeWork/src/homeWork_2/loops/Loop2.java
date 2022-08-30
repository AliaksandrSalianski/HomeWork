package homeWork_2.loops;

/**
 * Метод перемножает все числа введенного через аргумент числа и выводит ход вычислений в консоль.Число представляется как массив char при
 * помощи цикла идет перебор всех элементов и получение значения из char.Выбор знака "*" или "=" при помощи тернарного опператора и индекса ячейки массива.
 * Пользователь обязан ввести целое число. Если ввели не целое то выдается сообщение о том что пользователь ввёл некорректные данные.
 */

public class Loop2 {

    public String multiplication(String numberStr) {
        StringBuilder strResult = new StringBuilder();
        int result = 1;
        for (char c : numberStr.toCharArray()) {
            if (!Character.isDigit(c)) {
                return "Введено не число";
            }
            if (numberStr.contains(".")) {
                return "Введено не целое число";
            }
        }
        char[] charArray = numberStr.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int charToNumber = Character.digit(charArray[i], 10);
            result *= charToNumber;
            String multiplyOrEquals = i == charArray.length - 1 ? "=" + result : "*";
            strResult.append(charArray[i]).append(multiplyOrEquals);
        }

        return strResult.toString();
    }



    public static void main(String[] args) {
        Loop2 loop2 = new Loop2();
        System.out.println(loop2.multiplication("12405"));

    }
}


