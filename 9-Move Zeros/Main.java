// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] a = {0,1,0,3,12};
//         int c = 0;
//         int j = 0;
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] == 0) {
//                 c++;
//             }
//         }
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] > 0) {
//                 a[j] = a[i];
//                 j++;
//             }
//             }
//             for (int i = a.length-c; i < a.length; i++) {
//                 a[i]=0;
//             }
//             // else{
//             // a[a.length-i]=a[i];

//             // }
//             System.out.println(Arrays.toString(a));
//         }
//     }

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] nums = {-1,0,0,1,0};
        Solution s = new Solution();
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int c = 0;
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for(int i=nums.length-c;i<nums.length;i++){
            nums[i]=0;
        }
    }
}