// public class Main {
//     public static void main(String[] args) {
//         int n = 23;
//         int c = 0;
//         while (n!=0) {
//             n=n/10;
//             c++;
//         }
//         //n=n/10;
        
//         System.out.println(c);
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         int[] a = {12,345,2,6,7896};
//         int temp=0;
//         for (int i = 0; i < a.length; i++) {
//             int c = 0;
//             while (a[i]!=0) {
//                 a[i]=a[i]/10;
//                 c++;
//             }
//             if (c%2==0) {
//                 temp++;
//             }
//         }
//         System.out.println(temp);
//     }
// }


//This is my first question to pass all the test cases without any error

class Solution {
    public int findNumbers(int[] nums) {
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            while (nums[i]!=0) {
                nums[i]=nums[i]/10;
                c++;
            }
            if (c%2==0) {
                temp++;
            }
        }
        return temp;
    }
}