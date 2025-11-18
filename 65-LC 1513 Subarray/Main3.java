// LeetCode 1513

class Solution {
    public int numSub(String s) {
        final int MOD = 1000000007;
        long ans = 0; 
        long n = 0;    
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                n++;
            } else {
                ans = (ans + n * (n + 1) / 2) % MOD;
                n = 0;
            }
        }
        ans = (ans + n * (n + 1) / 2) % MOD;
        return (int) ans;
    }
}



// public class Main3 {
//     public static void main(String[] args) {
//         String s="101";
//         int n=0;
//         int ans=0;
//         for (int j = 0; j <s.length(); j++) {
//             if(s.charAt(j)=='1'){
//                 n++;
//             }
//             else{
//                 ans+=n*(n+1)/2;
//                 n=0;
//             }
//         }
//         ans+=n*(n+1)/2;
//         System.out.println(ans);
//     }
// }
