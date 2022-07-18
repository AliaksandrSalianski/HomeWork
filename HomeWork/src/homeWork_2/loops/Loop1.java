package homeWork_2.loops;

public class Loop1 {
    /**
     * Циклы. Для преобразования строки в число можно использовать http://proglang.su/java/numbers-parseint, если хотите можете добавить проверки на корректность ввода данных.
     * Число положительное, максимум long:
     * 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
     * Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
     * 1.1.1. Используя только цикл
     * 1.1.2.* Используя рекурсию
     */
    public static void main(String[] args) {
        multiplyWithCycle(23);
    }

    public static void multiplyWithCycle(int number) {
        long result = 1;
        if (!(number > 0)) {
            System.out.println("wrong input");
        } else {
            long previousResult = 1;
            for (int i = 1; i <= number; i++) {
                previousResult *= i;
                if (previousResult < 0) {
                    System.out.println(i + " overflow of \"long\" type number= " + "result =" + previousResult);
                    System.out.printf("value at i = %d = %d",i-1,result);
                    break;
                } else {
                    result *= i;
                    String multiplyOrEquals = i == number ? "=" + result : "*";
                    System.out.print(i + multiplyOrEquals);
                }
            }
        }
    }
}