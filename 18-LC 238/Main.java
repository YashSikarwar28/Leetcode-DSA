// LC 238 Product of array expect self

// This solution is correct but exceeded the time limit
// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] a ={1,2,3,4};
//         int[] b = new int[a.length];
        
//         for (int i = 0; i < a.length; i++) {
//             int prod = 1;
//             for (int j = 0; j < a.length; j++) {
//                 if (i!=j) {
//                     prod = prod*a[j];
//                 }
//             }
//             b[i]=prod;
//         }
//         System.out.println(Arrays.toString(b));
//     }
// }



class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] b = new int[nums.length];
        b[0]=1;
        for(int i=1;i<nums.length;i++){
            b[i]=b[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            b[i]=b[i]*right;
            right=right*nums[i];
        }
        return b;
    }
}