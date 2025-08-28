import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] a) {
        Arrays.sort(a);
        int max=a[a.length-1]*a[a.length-2]*a[a.length-3];
        int min=a[0]*a[1]*a[a.length-1];
        return Math.max(max,min);
    }
}


// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] a = { 1,2,3,4 };
//         Arrays.sort(a);
//         int prod = a[0] * a[1] * a[2];
//         for (int i = 0; i < a.length; i++) {
//             if (i > 0 && a[i] == a[i - 1])
//                 continue;
//             int l = i + 1;
//             int r = a.length - 1;
//             while (l < r) {
//                 int closeProd = a[i] * a[l] * a[r];
//                 if (closeProd > prod) {
//                     // l++;
//                     prod = closeProd;
//                     r--;
//                 } else {
//                     l++;
//                 }
//             }
//         }
//         System.out.println(prod);
//     }
// }
