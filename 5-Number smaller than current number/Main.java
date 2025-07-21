// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] a = {5,0,10,0,10,6};
//         int[] b = new int[a.length];
//         int c=0;
//         int i=0;

//         while (i!=a.length) {
//             for (int index = 0; index < a.length; index++) {
//                 if (a[i]>a[index]) {
//                     c++;
//                     b[i]=c;
//                 }
//                 else if(a[i]<a[index]){
//                     c=0;
//                 }
//             }
//             i++;
//         }

//         System.out.println(c);
//         System.out.println(Arrays.toString(b));
//         }

//     }

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] b = new int[nums.length];
        int i = 0;

        while (i != nums.length) {
            int c = 0; // reset counter for each i
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    c++;
                }
            }
            b[i] = c;
            i++;
        }
        return b;
    }
}
