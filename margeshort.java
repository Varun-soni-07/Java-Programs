
import java.util.*;

public class margeshort {
    static void show(int[] a) {
        for (int y : a) {
            System.out.println(y);
        }
    }

    public static int[] marge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int g = 0;
        int[] b = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                b[g++] = left[i++];
            } else {
                b[g++] = right[j++];
            }
        }
        while (i < left.length) {
            b[g++] = left[i++];
        }
        while (j < right.length) {
            b[g++] = right[j++];
        }
        return b;
    }

    public static int[] margesort(int[] a, int st, int end) {
        if (end == st) {
            return new int[] { a[st] };
        }
        int mid = st + ((end - st) / 2);
        int[] left = margesort(a, st, mid);
        int[] right = margesort(a, mid + 1, end);
        return marge(left, right);

    }

    public static void main(String[] args) {
        int[] ar = { 8, 2, 4, 6, 3, 1, 8, 5 };
        int end = ar.length - 1;
        int st = 0;
        int[] arr = margesort(ar, st, end);
        show(arr);
    }
}
