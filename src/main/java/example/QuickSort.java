package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    private boolean secondClassLessThanFirstClass(A a1, A a2) {
        return (a1.getFirstInt() + a1.getSecondInt()) < (a2.getFirstInt() + a2.getSecondInt());
    }

    public A[] sort(A[] a) {
        if (a.length < 2) {
            return a;
        }
        if (a.length == 2) {
            if (secondClassLessThanFirstClass(a[0], a[1])) {
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
                if (secondClassLessThanFirstClass(a[i], a[middle])) {
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
