package example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortV2<T extends Comparable> {

    private Class TClass;
    public QuickSortV2(Class<T> myClass){
        TClass=myClass;
    }

    public T[] sort(T[] a) {
        if (a.length < 2) {
            return a;
        }
        if (a.length == 2) {
            if (a[0].compareTo(a[1]) <= 0) {
                T temp = a[0];
                a[0] = a[1];
                a[1] = temp;

            }
        }

        int middle = (a.length / 2) - 1;
        List<T> lessPart = new ArrayList();
        List<T> morePart = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            if (i != middle) {
                if (a[i].compareTo(a[middle]) <= 0) {
                    lessPart.add(a[i]);
                } else {
                    morePart.add(a[i]);
                }
            }
        }

        T[] newArray =(T[]) Array.newInstance(TClass,a.length);

        List<T> aList = new ArrayList<T>();

        T[] firstPart = (sort(lessPart.toArray((T[]) Array.newInstance(TClass,lessPart.size()))));
        aList.addAll(Arrays.asList(firstPart));
        aList.add(a[middle]);
        T[] secondPart = (sort(morePart.toArray(((T[]) Array.newInstance(TClass,morePart.size())))));
        aList.addAll(Arrays.asList(secondPart));

        newArray = aList.toArray(newArray);
        return newArray;
    }
}
