// public class Main {
//     public static void main(String[] args) {
//         int[] a = {1,3,1};
//         int c = 0;
//         int d = 0;
//         if (a.length!=0 && a.length==2 && a[a.length-1]>a[a.length-2]) {
//             d=a[a.length-1];
//             System.out.println(d);
//         }
//         else if(a.length!=0 && a.length==2 && a[a.length-2]>a[a.length-1]){
//             d=a[a.length-2];
//             System.out.println(d);
//         }
//         else if(a.length==3){
//             d=a[a.length-2];
//             System.out.println(d);
//         }
//         for (int i = 0; i < a.length; i++) {
//             if (i%2==0) {
//                 c=c+a[i];
//             }
//         }
//         System.out.println(c);
//         //System.out.println(d);
//     }
// }

class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int p2=0;
        int p1=0;
        for(int num:nums){
            int temp = p1;
            p1=Math.max(p1,p2+num);
            p2=temp;
        }
        return p1;
    }
}