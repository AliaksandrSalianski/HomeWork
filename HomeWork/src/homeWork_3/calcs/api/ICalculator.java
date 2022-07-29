package homeWork_3.calcs.api;

/**
 *интерфейс содержит методы  основных математических операций
 */
public interface ICalculator {
    /**
     * метод сложения
     * @param one первый операнд
     * @param two второй операнд
     * @return возврощает сумму oneNumber и twoNumber
     */
    double giveSumma(double one , double two);

    /**
     * метод вычитания
     * @param one первый операнд
     * @param two второй операнд
     * @return возрвщает разность oneNumber и twoNumber
     */
    double giveMinus(double one , double two);

    /**
     * метод умножения
     * @param one первый операнд
     * @param two второй операнд
     * @return возврощает произведение oneNumber и twoNumber
     */
    double giveMultiply(double one , double two);

    /**
     * метод деления
     * @param one первый операнд
     * @param two второй операнд
     * @return вооооозвращает результат деления oneNumber на twoNumber
     */
    double giveDivision(double one , double two);

    /**
     * метод квадратного кореня
     * @param one
     * @return возвращает корень oneNumber
     */
    double giveRoot(double one);

    /**
     * метод возведения в степень
     * @param one число возводимое в степень
     * @param two степень числа
     * @return возвращает возведение oneNumber в степень twoNumber
     */
    double giveDegree(double one,int two);

    /**
     * метод модуля числа
     * @param one
     * @return возвращает модуль oneNumber
     */
    double giveModule(double one);
}
