package home_work_1;

public class Task8 {
    public static String toBinaryString(byte number) {
        if (number > 0) return makeBinaryIfPositive(number);// если вводимое число > 0
        else return makeBinaryIfNegative(number);// если вводимое число < 0
    }

    private static String makeBinaryIfPositive(byte number) {
        //прямой код только для положительных чисел.Знаковый бит всегда 0 =>диапозон чисел -127 до +127
        String result = "";// для конкатенации с числом для получения строки
        int[] arrayWithZero = new int[8];//массив на 8 элементов по дефолту [0,0,0,0,0,0,0,0]
        int flagIndexInArray = arrayWithZero.length - 1;//индекс для элемента массива
        while (number != 0) {
            arrayWithZero[flagIndexInArray] = (number % 2);// записываем с последнего элемента массива 0 или 1
            number /= 2;
            flagIndexInArray--;// уменьшаем индекс
        }
        for (int numIn : arrayWithZero) {
            result += numIn;//поэлементно преобразуем число в строку
        }
        return result;
    }
    private static String makeBinaryIfNegative(byte number) {
        number *= -1;// убираем минус чтобы он не попадал как char в массив
        number -=1;// отнимаем от числа еденицу
        String str = makeBinaryIfPositive(number);
        char[] arrayOfChar = str.toCharArray();
        for (int i = 0; i < arrayOfChar.length; i++) {
            if (arrayOfChar[i] == '0') {//инвертирования всех битов
                arrayOfChar[i] = '1';
            } else {
                arrayOfChar[i] = '0';
            }
        }
        return String.valueOf(arrayOfChar);
    }
}


