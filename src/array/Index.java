package array;

public class Index {
     public static int Return(int[] a, int b) {

         int element = -1;

         for (int i = 0; i < a.length; i++) {
             if (a[i] == b) {
                 element = i;
                 break;
             }
         }
         return element;
     }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Return(a, 100));
     }
}
