public class Quickshort {

    static void swap(int[] b, int a, int c) {
        int t = b[a];
        b[a] = b[c];
        b[c] = t;
    }

    public static int quick(int[] ar, int st, int end) {
        int id = st - 1;
        int r = st;
        int y = ar[end];
        while (r < ar.length) {
            if (ar[r] < y) {
                id++;
                swap(ar, id, r);
            }
            r++;
        }
        swap(ar, id + 1, end);
        return id + 1;
    }

    public void quickshort(int[] ar, int st, int end) {
        Quickshort a2 = new Quickshort();
        if (end > st) {
            int p = quick(ar, st, end);
            a2.quickshort(ar, st, p - 1);
            a2.quickshort(ar, p + 1, end);
        }
    }

    static void show(int[] a) {
        for (int y : a) {
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        Quickshort a1 = new Quickshort();
        int[] ar = { 8, 2, 4, 6, 3, 1, 8, 5 };
        int end = ar.length - 1;
        int st = 0;
        a1.quickshort(ar, st, end);
        show(ar);
    }

}