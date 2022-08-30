package home_work_1;

/**
 * в классе реализована проверка вводимого номера и возвращает его в правильном формате
 */
public class Task7 {
    public String checkPhone(byte[] arg) {

        if (!(arg.length == 10)) {
            return "Invalid format";
        }
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] < 0 || arg[i] > 9) {
                int realPosition = (i + 1);
                return "error in position " + realPosition;
            }
        }
        return "(" + arg[0] + arg[1] + arg[2] + ")" + " " + arg[3] + arg[4] + arg[5] + "-" + arg[6] + arg[7] + arg[8] + arg[9] + ".";
    }

    public static void main(String[] args) {
        Task7 task7 = new Task7();
        byte [] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(task7.checkPhone(array));
    }
}
