package homeWork_4;

import java.util.Comparator;


public class DataComparatorHash implements Comparator<Object> {


    @Override
    public int compare(Object a, Object b) {
        if (a == null) {
            return 1;
        } else if (b != null && a.hashCode() > b.hashCode()) {
            return 1;
        } else if (b != null && a.hashCode() < b.hashCode()) {
            return -1;
        } else {
            return 0;
        }
    }

}

