package example;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        A[] a = new A[10];
        a[9] = new A(0, 1);
        a[2] = new A(1, 1);
        a[3] = new A(2, 1);
        a[1] = new A(2, 2);
        a[4] = new A(2, 3);
        a[5] = new A(3, 3);
        a[7] = new A(4, 3);
        a[6] = new A(4, 4);
        a[8] = new A(4, 5);
        a[0] = new A(5, 5);
        System.out.println(Arrays.toString(a));
        QuickSort quickSort = new QuickSort();
        System.out.println(Arrays.toString(quickSort.sort(a)));
        System.out.println("v2");
        QuickSortV2 quickSortV2 = new QuickSortV2();
        System.out.println(Arrays.toString(quickSortV2.sort(a)));;
    }
}
