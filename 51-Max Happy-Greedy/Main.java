import java.util.Arrays;

class Solution {
    public long maximumHappinessSum(int[] a, int k) {
        Arrays.sort(a); // sort ascending
        
        // Reverse the array in-place to get descending
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        long sum = 0;

        // Loop through the top k elements, applying the happiness reduction
        for (int i = 0; i < k; i++) {
            int reduced = a[i] - i;
            if (reduced < 0) reduced = 0;
            sum += reduced;
        }

        return sum;
    }
}




// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] a = { 12, 1, 42 };
//         Arrays.sort(a);
//         int[] b = new int[a.length];
//         int c = 0;
//         for (int i = a.length - 1; i >= 0; i--) {
//             b[c] = a[i];
//             c++;
//         }
//         System.out.println(Arrays.toString(b));
//         int[] d = new int[b.length];
//         int k = 3;
//         d[0] = b[0];
//         int j = 1;
//         for (int i = 1; i < b.length && j <= k; i++, j++) {
//             if (d[i] < 0) {
//                 d[i] = 0;
//             } else {
//                 d[i] = b[i] - j;
//             }
//         }
//         System.out.println(Arrays.toString(d));
//         int sum = 0;
//         for (int i = 0; i < d.length && k > 0; i++, k--) {
//             sum += d[i];
//         }
//         System.out.println(sum);
//     }
// }