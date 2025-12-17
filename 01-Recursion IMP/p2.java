//LeetCode 1545

class Solution {
    public char findKthBit(int n, int k) {
        if(n==1) return '0';
        int len=(1<<n)-1;
        k=k-1;
        if(k<0 || k>=len){
            return '0';
        }
        int mid=len/2;
        if(k==mid){
            return '1';
        }
        else if(k<mid){
            return findKthBit(n-1,k+1);
        }else{
            char ch=findKthBit(n-1,len-k);
            return (ch=='0')?'1':'0';
        }
    }
}



// public class p2 {
//     public static void main(String[] args) {
//         System.out.println(find("011100110110001", 11));
//     }
//     static char find(String s,int k){
//         int n=s.length();
//         k=k-1;
//         if (k<0 || k>=n) {
//             return '0';
//         }
//         if (k<n/2) {
//             return s.charAt(k);
//         }
//         else if (k==n/2) {
//             return '1';
//         }else{
//             char ch=s.charAt(n-k-1);
//             return ch=='0'?'1':'0';
//         }
//     }
// }