package homeWork_2.loops;

public class Loop1 {
    /**
     * Метод перемножает числа от 1 до числа (включительно) введенного через аргумент метода.
     * в случае переполнения выводится сообщение со значением до переполнения и при переполненнии
     * Используется только цикл
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

    public static void main(String[] args) {
        System.out.println(multiplyWithRecursion(25));
        ;
    }

    /**
     * Число положительное, максимум long:
     * Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
     * Используя рекурсию
     */
    public static long multiplyWithRecursion(int number) {
        // печатает в обратном порядке
        long result = 1;
        if (number < 0) {
            System.out.print("wrong input");
        }
        if (number == 1) {
            System.out.print("*1 = " + result);
            return result;
        }
        System.out.print(number);
        if (number != 2) {
            System.out.print("*");
        }
        result = number * multiplyWithRecursion(number - 1);
        if (result < 0) {
            System.out.println("");
            System.out.print(" overflow");
            System.out.println(" in number =" + number);
            return result;
        }
        return result;
    }

}

