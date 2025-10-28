class Solution {
    public int getXORSum(int[] a, int[] b) {
        int s1=0;
        int s2=0;
        for(int i:a) s1^=i;
        for(int j:b) s2^=j;
        return s1&s2;
    }
}



//This solution is correct but it got TLE error
// import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {
//         int[] a = { 12 };
//         int[] b = { 4 };
//         int i = 0;
//         int j = 0;
//         ArrayList<Integer> c = new ArrayList<>();
//         while (i < a.length) {
//             // while (j<b.length) {
//             // c.add(a[i]&b[j]);
//             // j++;
//             // }
//             // i++;
//             // j=0;
//             c.add(a[i] & b[j]);
//             j++;
//             if (j == b.length) {
//                 j = 0;
//                 i++;
//             }
//         }
//         System.out.println(c);
//         // c.toArray();
//         int sum=0;
//         for (int k :c){
//         sum^=k;
//         }
//         System.out.println(sum);
//     }
// }