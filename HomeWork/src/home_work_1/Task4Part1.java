package home_work_1;


public class Task4Part1 {

    public static void defineOddNumber() {
        int random = (int) (1 + Math.random() * 100); //random number from 1 to 99
        int numberTwo = random + 1;
        if (random % 2 == 0) {
            System.out.printf("Not Even number is %d\n", numberTwo);
        } else {
            System.out.printf("Not Even number is %d\n", random);
        }
    }
}
