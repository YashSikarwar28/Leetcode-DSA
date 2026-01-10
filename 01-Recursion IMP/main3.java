import java.util.Arrays;

class Solution {
    public boolean predictTheWinner(int[] a) {
        int sum = Arrays.stream(a).sum();
        int ans = solve(0, a.length - 1, a);

        return ans >= sum - ans;
    }

    public int solve(int i, int j, int[] a) {
        if (i > j)
            return 0;
        if (i == j)
            return a[i];

        int take_i = a[i] + Math.min(solve(i + 2, j, a), solve(i + 1, j - 1, a));
        int take_j = a[j] + Math.min(solve(i, j - 2, a), solve(i + 1, j - 1, a));

        return Math.max(take_i, take_j);
    }
}

// public class main3 {
// public static void main(String[] args) {
// int[] a={1,5,233,7};
// predict(a, 0, a.length-1, 0, 0);
// }
// static void predict(int[] a,int i,int j,int s1,int s2){
// if (i>j) {
// System.out.println(s1);
// System.out.println(s2);
// return;
// }
// s1=s1+a[i];
// i++;
// if (a[i]>a[j]) {
// predict(a, i++, j, s1, s2+a[i]);
// // s2+=a[i];
// // i++;
// }
// else{
// predict(a, i, j--, s1, s2+a[j]);
// // s2+=a[j];
// // j--;
// }
// }
// }