package homeWork_4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * В Классе реализован динамический массив для хранения обобщенного типа данных типа <T>
 * Данный класс умеет удалять данные из себя двумя способами: по индексу и конкретный элемент,сортировать элементы массива.
 * имеет private поле T[] data
 *
 * @param <T> обобщенный типа данных
 */
public class DataContainer<T> {
    private T[] data;

    /**
     * Конструктор
     *
     * @param data дженерелизированный массив
     */
    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Геттер
     *
     * @return возвращает data[]
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Метод возвращает элемент по индексу
     *
     * @param index индекс элемента который нужно вернуть
     * @return возвращает обьект под индексом index
     */
    public T get(int index) {
        if (index >= data.length || index < 0) {
            return null;
        } else {
            return data[index];
        }

    }

    /**
     * Метод добовляет элемент в массив в первую найденную ячейку со значением null.
     *
     * @param item элемент который добавляют в массив
     * @return возвращает индекс ячейки в которой добавлен элемент
     */
    public int add(T item) {
        int index = findNull();
        if (index == -1) {
            final int flagIndex = data.length;
            increaseArray();
            data[flagIndex] = item;
            return flagIndex;
        } else {
            data[index] = item;
        }
        return index;
    }

    /**
     * Метод ищет ячейку со значением null и возвращает индекс этой ячейки, если такая ячейка не найдена то возвращает -1
     *
     * @return возвращает индекс ячейки со значением null
     */
    private int findNull() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Метод увеличивает массив
     *
     * @return возвращает массив длинной больше на 1
     */
    private T[] increaseArray() {
        return data = Arrays.copyOf(data, data.length + 1);
    }

    /**
     * Метод уменьшает массив на одну ячейку под индексом index сдвигая все элементы массива
     *
     * @param index индекс ячейки которую удаляют
     * @return возвращает массив размером меньше на одну ячейку
     */
    @SuppressWarnings("unchecked")
    private T[] narrowingArray(int index) {
        T[] foo = (T[]) new Object[data.length - 1];
        System.arraycopy(data, 0, foo, 0, index);
        System.arraycopy(data, index + 1, foo, index, data.length - index - 1);
        this.data = foo;
        return data;
    }

    /**
     * Метод удаляет элемент под индексом index
     *
     * @param index индекс для удаления
     * @return возвращает true если удаление удалось и false если удаление не удалось
     */
    public boolean delete(int index) {
        if (index >= data.length || index < 0) {
            return false;
        } else {
            data[index] = null;
        }
        narrowingArray(index);
        return true;
    }

    /**
     * Метод удаляет заданный элемент из массива
     *
     * @param item элемент коротый удаляют
     * @return при удаление возвращает true, если удаление не удалось возвращает false
     */
    public boolean delete(T item) {
        int index = findElement(item);
        if (index == -1 || item == null) {
            return false;
        }
        return delete(index);
    }

    /**
     * Метод ищет переданный элемент в массиве и возвращает индекс ячейки ,если элемент найден
     *
     * @param item элемент который нужно найти в массиве
     * @return если элемент найден возвращает индекс ячейки , если не найден ,то -1
     */

    private int findElement(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == item) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Метод удаляет все ячейки в которых хранится null
     *
     * @param data массив в которм нужно удалить ячейки со значением null
     * @return возвращает массив
     */
    @SuppressWarnings("unchecked")
    private T[] getArrayWithoutNull(T[] data) {
        int countOfNull = 0;
        for (T arg : data)
            if (arg == null) {
                countOfNull++;
            }
        if (countOfNull == 0) {
            return data;
        } else {
            T[] arr = (T[]) new Object[data.length - countOfNull];
            int foo = 0;
            for (T datum : data) {
                if (datum != null) {
                    arr[foo] = datum;
                    foo++;
                }
            }
            data = arr;
        }
        return data;
    }

    /**
     * переопределенный метод toString
     *
     * @return возвращает массив без null значений
     */
    @Override
    public String toString() {
        return "{" +
                Arrays.toString(getArrayWithoutNull(data)) +
                '}';
    }

    /**
     * Метод сартирует массив
     *
     * @param comparator переменная интерфейса Comparator
     */
    public void sort(Comparator<? super T> comparator) {
        for (int i = 0; i < data.length; i++) {
            for (int j = (data.length - 1); j > i; j--) {
                int resultOfCompare = (comparator.compare(data[j - 1], data[j]));
                if (resultOfCompare > 0) {
                    T foo = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = foo;
                }
            }
        }
    }

    /**
     * Метод сортирует массив
     *
     * @param container  экземляр класса DataContainer
     * @param comparator переменная интерфейса Comparator
     * @param <E>        обобщенный тип данных
     */
    public static <E> void sort(DataContainer<E> container, Comparator<? super E> comparator) {
        for (int i = 0; i < container.getItems().length; i++) {
            for (int j = (container.getItems().length - 1); j > i; j--) {
                int resultOfCompare = (comparator.compare(container.getItems()[j - 1], container.getItems()[j]));
                if (resultOfCompare > 0) {
                    E foo = container.getItems()[j - 1];
                    container.getItems()[j - 1] = container.getItems()[j];
                    container.getItems()[j] = foo;
                }
            }
        }
    }

    /**
     * Метод сортирует массив
     *
     * @param container экземляр класса DataContainer
     * @param <E>       обобщенный тип данных
     */

    public static <E extends Comparable<E>> void sort(DataContainer<E> container) {
        for (int i = 0; i < container.getItems().length; i++) {
            for (int j = (container.getItems().length - 1); j > i; j--) {
                E item1 = container.getItems()[j - 1];
                E item2 = container.getItems()[j];
                int resultOfCompare = (item1.compareTo(item2));
                if (resultOfCompare > 0) {
                    E foo = container.getItems()[j - 1];
                    container.getItems()[j - 1] = container.getItems()[j];
                    container.getItems()[j] = foo;
                }
            }
            
        }
    }

}

