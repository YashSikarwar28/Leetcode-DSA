// public class Main {
//     public static void main(String[] args) {
//         int[] a = {1,3,4,2,2};
//         int b=0;
//         for (int i = 0; i < a.length; i++) {
//             for (int k = 1; k < a.length; k++) {
//                 if(a[i]==a[k]&&i!=k){
//                     b=a[i];
//                 }
//             }
//         }
//          System.out.println(b);  
//     }
// }


class Solution {
    public int findDuplicate(int[] nums) {
        int b = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j){
                    b=nums[i];
                }
            }
        }
        return b;
    }
}