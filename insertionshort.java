
public class insertionshort {
    static void show(int[] a) {
        for (int y : a) {
            System.out.println(y);
        }
    }

    static void swap(int[] b, int a, int c) {
        int t = b[a];
        b[a] = b[c];
        b[c] = t;
    }

    public static void cd(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j - 1, j);
                }
            }
        }
        show(a);
    }

    public static void main(String[] args) {
        int[] ar = { 8, 2, 4, 6, 3, 1, 8, 5 };
        cd(ar);
    }
}
