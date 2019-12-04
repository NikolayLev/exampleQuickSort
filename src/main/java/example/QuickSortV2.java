package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortV2 {


    public A[] sort(A[] a) {
        if (a.length < 2) {
            return a;
        }
        if (a.length == 2) {
            if (a[0].compareTo(a[1]) <= 0) {
                A temp = a[0];
                a[0] = a[1];
                a[1] = temp;

            }
        }

        int middle = (a.length / 2) - 1;
        List<A> lessPart = new ArrayList();
        List<A> morePart = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            if (i != middle) {
                if (a[i].compareTo(a[middle]) <= 0) {
                    lessPart.add(a[i]);
                } else {
                    morePart.add(a[i]);
                }
            }
        }

        A[] newArray = new A[a.length];

        List<A> aList = new ArrayList<A>();

        A[] firstPart = (sort(lessPart.toArray(new A[lessPart.size()])));
        aList.addAll(Arrays.asList(firstPart));
        aList.add(a[middle]);
        A[] secondPart = (sort(morePart.toArray(new A[morePart.size()])));
        aList.addAll(Arrays.asList(secondPart));

        newArray = aList.toArray(newArray);
        return newArray;


    }
}
