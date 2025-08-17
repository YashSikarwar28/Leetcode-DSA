import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,7};
        int k = 3;
        int[] b = new int[a.length];
        int c= 0;
        int d=k;
        for (int i = a.length-k; i < a.length; i++) {
            b[c]=a[i];
            c++;
        }
        for (int i = 0; i <a.length-k; i++) {
            b[d]=a[i];
            d++;
        }
         a = b;
        System.out.print(Arrays.toString(a));
       
    }

}
