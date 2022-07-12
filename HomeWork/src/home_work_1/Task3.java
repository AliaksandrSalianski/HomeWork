package home_work_1;

public class Task3 {
    public static void showMathOperations() {
        double numberOne;
        double numberTwo;
        int random;
        double result;
        // 1. Random integer number from 1 to 9
        random = (int) (1 + Math.random() * 10);
        System.out.printf("Random number from 1 to 9  = %d\n", random);

        // 2. Find "PI number"
        numberTwo = Math.PI;
        System.out.printf("PI = %f.3\n", numberTwo);

        // 3. Calculating the area of a circle with a random radius.
        result = numberTwo * Math.pow(random, 2);
        System.out.printf("area of circle with radius %d.0 = %f.1\n", random, result);

        // 4. Round to the nearest integer.
        result = Math.round(result);
        System.out.printf("round to the nearest integer = %d\n", (int) result);

        // 5. Square root area of circle
        System.out.printf("Square root of = %f\n", Math.sqrt(result));

        // 6. Find "max" number
        numberOne = Math.max(random, result);
        System.out.printf("Max = %f\n", numberOne);

        // 7. Find "min" number
        numberTwo = Math.min(random, result);
        System.out.printf("Min = %f\n", numberTwo);

        // 8. Modulus of difference from min max
        result = Math.abs(numberTwo - numberOne);
        System.out.printf("| Min - Max | = %f\n", result);

        // 9. Cos of result
        result = Math.cos(result);
        System.out.printf("Cos = %f\n", result);

        // 10. Number "E"
        numberOne = Math.E;
        System.out.printf("E = %f.3\n", numberOne);
    }
}
