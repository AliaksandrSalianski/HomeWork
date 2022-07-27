package homeWork_3.runners;

/**
 * печатает значение выражения.
 */
public class WithoutCalculatorMain {
    public static void main(String[] args) {
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2");
        double result = 4.1 + 15 * 7 + Math.pow((28.0 / 5), 2);//140.6
        System.out.println("____");
        System.out.println(result);
    }
}
