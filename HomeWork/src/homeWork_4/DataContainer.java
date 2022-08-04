package homeWork_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }


    public T[] getItems() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    /////
    public T get(int index) {
        if (index > data.length || index < 0) {
            return null;
        } else {
            return data[index];
        }

    }

    /////
    public int add(T item) {
        int index = findNull();
        if (index == -1) {
            data = increaseArray();
            index = findNull();
            data[index] = item;
            return index;
        } else {
            data[index] = item;
        }
        return index;
    }

    //////
    private int findNull() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @return
     */
    private T[] increaseArray() {
        int lenNewArray = data.length + data.length >> 1;
        return Arrays.copyOf(data, lenNewArray);
    }

    /**
     * @param index
     * @return
     */
    @SuppressWarnings("unchecked")
    private T[] narrowingArray(int index) {
        T[] arr = (T[]) new Object[data.length - 1];
        System.arraycopy(data, 0, arr, 0, index);
        System.arraycopy(data, index + 1, arr, index, data.length - index - 1);
        return arr;
    }

    /**
     * @param index
     * @return
     */
    public boolean delete(int index) {
        if (index > data.length || index < 0) {
            return false;
        } else
            data[index] = null;
        narrowingArray(index);
        return true;
    }

    /**
     * @param item
     * @return
     */
    public boolean delete(T item) {
        int index = findElement(item);
        if (index == -1) {
            return false;
        } else {
            data[index] = null;
            narrowingArray(index);
        }
        return true;
    }

    /**
     *
     * @param item
     * @return
     */

    private int findElement(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == item) {
                return i;
            }
        }
        return -1;
    }

}