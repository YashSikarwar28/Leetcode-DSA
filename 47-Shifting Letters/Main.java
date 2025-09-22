class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        StringBuilder result = new StringBuilder();
        int[] cumulativeShifts = new int[n];
        long sum = 0;

        // Compute cumulative shifts from the end of the array
        for (int i = n - 1; i >= 0; i--) {
            sum = (sum + shifts[i]) % 26;
            cumulativeShifts[i] = (int) sum;
        }

        // Apply shifts to characters
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int shift = cumulativeShifts[i];
            char shiftedChar = (char) ((c - 'a' + shift) % 26 + 'a');
            result.append(shiftedChar);
        }

        return result.toString();
    }
}


// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;

// public class Main2 {
//     public static void main(String[] args) {
//         String s="abc";
//         StringBuilder p=new StringBuilder();
//         int[] a={3,5,9};
//         int[] b=new int[a.length];
//         int j=0;
//         int k=1;
//         int sum=0;
//         int asum=0;
//         for (int i = 0; i < a.length; i++) {
//             sum+=a[i];
//         }
//         b[0]=sum;
//         while (k<a.length) {
//             asum+=a[j];
//             b[k]=sum-asum;
//             k++;
//             j++;
//         }
        
//         for (int i = 0; i < b.length; i++) {
//             char c=s.charAt(i);
//             int shift=b[i];
//             char shiftChar=(char)(c+shift);
//             if (shiftChar>'z') {
//                 shiftChar=(char)(shiftChar-26);
//             }
//             p.append(shiftChar);
//         }
//         System.out.println(p);
//         System.out.println(Arrays.toString(b));
//     }
// }
