package homeWork_3.calcs.additional;

import homeWork_3.calcs.api.ICalculator;

/**
 * Класс реализует интерфейс ICalculator. Конструктор класса принимает обьекты классов реализующих данный интрефейс.
 * Класс делегирует пререданному обьекту в конструктор расчет основных математических оппераций
 * Добавлены методы:
 * memorize - метод сохраняет в память результат выполнения последнего вызванного метода
 * takeOutOfMemory - возврощает сохраненное значение из памяти
 * имеет три поля:
 * tmpResult - для временного хранения результата
 * numberInMemory - значение занесенное в память при помощи метода memorize
 * iCalculator - переменная интерфейса для обьекта переданного в коструктор
 */
public class CalculatorWithMemory implements ICalculator {
    private double tmpResult;
    private double numberInMemory;
    private final ICalculator iCalculator;

    /**
     * конструктор принимающий обьект ICalculator
     *
     * @param iCalculator
     */
    public CalculatorWithMemory(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    /**
     * метод сохраняет  в память результат выполнения последнего вызванного метода.
     */
    public void memorize() {
        numberInMemory = tmpResult;
    }

    /**
     * метод возвращает значение из памяти и удаляет его из памяти
     *
     * @return значение из памяти
     */
    public double takeOutOfMemory() {
        double outPut = numberInMemory;
        numberInMemory = 0;
        return outPut;
    }

    /**
     * метод сложения
     *
     * @param one первый операнд
     * @param two второй операнд
     * @return возврощает сумму параметров метода
     */
    @Override
    public double giveSumma(double one, double two) {
        double result = iCalculator.giveSumma(one, two);
        tmpResult = result;
        return result;
    }

    /**
     * метод вычитания
     *
     * @param one первый операнд
     * @param two второй операнд
     * @return возрвщает разность oneNumber и twoNumber
     */
    @Override
    public double giveMinus(double one, double two) {
        double result = iCalculator.giveMinus(one, two);
        tmpResult = result;
        return result;
    }

    /**
     * метод умножения
     *
     * @param one первый операнд
     * @param two второй операнд
     * @return возврощает произведение параметров метода
     */
    @Override
    public double giveMultiply(double one, double two) {
        double result = iCalculator.giveMultiply(one, two);
        tmpResult = result;
        return result;
    }

    /**
     * метод деления
     *
     * @param one первый операнд
     * @param two второй операнд
     * @return вооооозвращает результат деления oneNumber на twoNumber
     */
    @Override
    public double giveDivision(double one, double two) {
        double result = iCalculator.giveDivision(one, two);
        tmpResult = result;
        return result;
    }

    /**
     * метод квадратного кореня
     *
     * @param one
     * @return возвращает корень числа
     */
    @Override
    public double giveRoot(double one) {
        double result = iCalculator.giveRoot(one);
        tmpResult = result;
        return result;
    }

    /**
     * метод возведения в степень
     *
     * @param one число возводимое в степень
     * @param two степень числа
     * @return возвращает возведение oneNumber в степень twoNumber
     */
    @Override
    public double giveDegree(double one, int two) {
        double result = iCalculator.giveDegree(one, two);
        tmpResult = result;
        return result;
    }

    /**
     * метод модуля числа
     *
     * @param one
     * @return возвращает модуль oneNumber
     */
    @Override
    public double giveModule(double one) {
        double result = iCalculator.giveModule(one);
        tmpResult = result;
        return result;
    }


}
