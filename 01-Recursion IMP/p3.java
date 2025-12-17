//LeetCode 779

class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1 && k==1) return 0;
        int pow=(int)Math.pow(2,n-1);
        int mid=pow/2;
        if(k<=mid){
            return kthGrammar(n-1,k);
        }
        return 1-kthGrammar(n-1,k-mid);
    }
}



// public class p3 {
//     public static void main(String[] args) {
//         System.out.println(find(2, 2));
//     }
//     static char find(int n,int k){
//         if(n==1) return '0';
//         int len=(1<<n)-1;
//         if (n%2==0) {
//             int mid=len/2;
//             if (k<mid) {
//                 return find(n-1, k+1);
//             }else if(k>=mid){
//                 char ch=find(n-1, len-k);
//                 return (ch=='0')?'1':'0';
//             }
//         }
//         else if (n%2!=0) {
//             int mid=len/2;
//             if (k<mid) {
//                 return find(n-1, k+1);
//             }
//             else if(k>=mid){
//                 return find(n-1, len-k);
//             }
//         }
//     }
// }
