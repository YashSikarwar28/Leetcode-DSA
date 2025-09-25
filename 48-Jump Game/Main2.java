class Solution {
    public int jump(int[] n) {
        int totJump=0;
        int cover=0;
        int lastJumpInd=0;
        int dest=n.length-1;
        if(n.length==1) return 0;
        for(int i=0;i<n.length;i++){
            cover=Math.max(cover,i+n[i]);
            if(i==lastJumpInd){
                lastJumpInd=cover;
                totJump++;
                if(cover>=dest){
                    return totJump;
                }
            }
        }
        return totJump;
    }
}


// public class Main2 {
//     public static void main(String[] args) {

//         int[] a = { 2, 4, 1, 2, 3, 1, 1, 2 };
//         int totJump = 0;
//         int coverage = 0;
//         int lastJumpInd = 0;
//         int dest = a.length - 1;
//         for (int i = 0; i < a.length; i++) {
//             coverage = Math.max(coverage, i + a[i]);
//             if (i == lastJumpInd) {
//                 lastJumpInd = coverage;
//                 totJump++;
//                 if (coverage >= dest) {
//                     System.out.println("True");
//                 }
//             }
//         }
//         System.out.println("False");
//         System.out.println(totJump);
//     }
// }
