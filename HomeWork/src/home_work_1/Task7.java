package home_work_1;

public class Task7 {
    public static String checkPhone(byte[] arg) {
        String result;
        if (!(arg.length == 10)) {//проверяем чтобы в массиве было 10 цифр
            return result = "Invalid phone number format";
        }
        for (int i = 0; i < arg.length; i++) {//проверяем чтобы цифры в массиве были от 0 до 10 по значению;
            if (arg[i] < 0 || arg[i] > 9) {
                int realPosition = (i + 1);//фактическое расположене неверной цифры в номере;
                return result = "Wrong number " + arg[i] + " entered in position " + realPosition;
            }
        }
        return result = "(" + arg[0] + arg[1] + arg[2] + ")" + " " + arg[3] + arg[4] + arg[5] + "-" + arg[6] + arg[7] + arg[8] + arg[9] + ".";
    }
}