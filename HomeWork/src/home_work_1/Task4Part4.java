package home_work_1;

/**
 * в клаасее реализовн перевод байтов в колобайты  и наоборот. Выбор осуществляется при помощи вводимых параметров метода
 * bytesToKilobytes байты в килобайты
 * kilobytesToBytes киолобайты в байты
 */

public class Task4Part4 {

    public double converting(String choice, double number) {
        switch (choice) {
            case ("bytesToKilobytes"):
                return number / 1024;
            case ("kilobytesToBytes"):
                return number * 1024;
            default:
                return 0.0;
        }
    }
}