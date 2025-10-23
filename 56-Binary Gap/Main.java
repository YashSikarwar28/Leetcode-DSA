class Solution {
    public int binaryGap(int n) {
        String a=Integer.toBinaryString(n);
        int max=0;
        int len=0;
        for(int i=1;i<a.length();i++){
            if(a.charAt(i)=='0') len++;
            if(a.charAt(i)=='1'){
                len++;
                max=Math.max(max,len);
                len=0;
            }
        }
        return max;
    }
}


// public class Main {
//     public static void main(String[] args) {
//         int n = 8;
//         // System.out.println(Integer.toBinaryString(n));
//         String a = Integer.toBinaryString(n);
//         int l = 0;
//         int len=0;
//         int max = 0;
//         for (int i = 1; i <a.length(); i++) {
//             if(a.charAt(i)=='0') len++;
//             if(a.charAt(i)=='1'){
//                 len++;
//                 max=Math.max(max,len);
//                 len=0;
//             }
//         }
//         System.out.println(max);
//     }
// }