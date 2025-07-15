
// class Solution {
//     public int[] runningSum(int[] nums) {
//         int[] b = new int[nums.length];
//         int s =0;
//         for (int i = 0; i < b.length; i++) {
//             s=s+b[i];
//             b[i]=s;
//         }       
//         return b;
//     }
// }

// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         int[] a = {2,3,4,1,6,4,8};
//         int tar = 7;
//         int i=0;
//             for (int j = 0;k=1; j < a.length-1; j++) {
            
                
//             }
//         }
//         }

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5,6,7};
        int[] b = new int[a.length];
        
        int sum=0;
        for (int i = 0; i < b.length; i++) {
            sum=sum+a[i];
            b[i]=sum;
        }
        System.out.println(Arrays.toString(b));
    }
}