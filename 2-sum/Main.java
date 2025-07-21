// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++){
//         for(int j=0;j<nums.length;j++){
//             if(i!=j && nums[i]+nums[j]==target){
//                 return new int[]{i,j};
//             }
//         } 
//        }
//        return new int[]{};
//     }
// }

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        for (int rows = 0; rows < a.length; rows++) {
            for(int col=0;col<a[rows].length;col++){
                int val = a[0][2];
                System.out.println(val);
            }
        }
        for(int[] b:a){
            // System.out.println(Arrays.toString(b));
        }
    }
}