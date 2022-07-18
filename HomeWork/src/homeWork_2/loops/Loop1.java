package homeWork_2.loops;

public class Loop1 {
    /**
     * Число положительное, максимум long:
     * Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
     * в случае переполнения выврдится сообщение
     * 1. Используя только цикл
     * 2. Используя рекурсию
     */

    public static void multiplyWithCycle(int number) {
        long result = 1;
        if (!(number >= 0)) {
            System.out.println("wrong input");
        } else {
            long previousResult = 1;
            for (int i = 1; i <= number; i++) {
                previousResult *= i;
                if (previousResult < 0) {
                    System.out.println(i + " overflow of \"long\" type number= " + "result =" + previousResult);
                    System.out.printf("value at i = %d = %d", i - 1, result);
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
