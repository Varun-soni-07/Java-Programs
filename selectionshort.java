
public class selectionshort {
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

    public static void selection(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {  
            int min=i;
           for (int j = i + 1; j < a.length; j++) {
              if(a[min]>a[j]){
               min=j;}
            }if (min!=i) {
                swap(a, i, min);
            }}
        show(a);
    }

  public static void main(String[] args) {
        int[] ar = { 8, 2, 4, 6, 3, 1, 8, 5 };
        selection(ar);
    }
}
