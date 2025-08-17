// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] a = {1, 2, 3, 1};

//         Arrays.sort(a); // O(n log n)
//         boolean hasDuplicate = false;

//         for (int i = 1; i < a.length; i++) {
//             if (a[i] == a[i - 1]) {
//                 hasDuplicate = true;
//                 break;
//             }
//         }

//         System.out.println(hasDuplicate);
//     }
// }


import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean hasDup = false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                hasDup = true;
                break;
            }
        }
        return hasDup;
    }
}