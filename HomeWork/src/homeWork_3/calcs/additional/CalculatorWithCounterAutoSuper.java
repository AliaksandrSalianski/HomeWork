package homeWork_3.calcs.additional;

import homeWork_3.calcs.simple.CalculatorWithMathExtends;

/**
 * класс является наследником класса CalculatorWithMathExtends
 * содержит поле count
 * метод incrementCountOperation() увеличивающий count на 1 при вызове
 * метод getCountOperation() возвращает значение count
 * методы родительского класса переопределены добавлен подсчет вызова калькулятора
 */
public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long countOperation;

    public long getCountOperation() {
        return countOperation;
    }

    private void incrementCountOperation() {
        countOperation++;
    }


    @Override
    public double giveSumma(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return super.giveSumma(oneNumber, twoNumber);
    }

    @Override
    public double giveMinus(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return super.giveMinus(oneNumber, twoNumber);
    }

    @Override
    public double giveMultiply(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return super.giveMultiply(oneNumber, twoNumber);
    }

    @Override
    public double giveDivision(double oneNumber, double twoNumber) {
        incrementCountOperation();
        return super.giveDivision(oneNumber, twoNumber);
    }

    @Override
    public double giveRoot(double oneNumber) {
        incrementCountOperation();
        return super.giveRoot(oneNumber);
    }

    @Override
    public double giveDegree(double oneNumber, int twoNumber) {
        incrementCountOperation();
        return super.giveDegree(oneNumber, twoNumber);
    }

    @Override
    public double giveModule(double oneNumber) {
        incrementCountOperation();
        return super.giveModule(oneNumber);
    }
}
