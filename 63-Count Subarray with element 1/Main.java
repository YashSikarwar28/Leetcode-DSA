class Solution {
    public int countMajoritySubarrays(int[] a, int tar) {
        int ans=0;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=i;j<a.length;j++){
                if(a[j]==tar){
                    count++;
                }
                if(count>(j-i+1)/2){
                    ans++;
                }
            }
        }
        return ans;
    }
}



// public class Main {
//     public static void main(String[] args) {
//         int[] a={1,2,2,3};
//         int tar=2;
//         int ans=0;
//         for (int i = 0; i < a.length; i++) {
//             int count=0;
//             for (int j = i; j < a.length; j++) {
//                 if (a[j]==tar) {
//                   count++;
//                 }
//                 if (count>(j-i+1)/2) {
//                   ans++;
//                 }  
//             }
//         }    
//         System.out.println(ans);
//     }
// }