//LC 3784

class Solution {
    public long minCost(String s, int[] cost) {
        long c=0;
        for(int i:cost){
            c+=i;
        }
        long[] charArr=new long[26];
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
            charArr[ind]+=cost[i];
        }
        long minCost=Long.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(charArr[i]>0){
                minCost=Math.min(minCost,c-charArr[i]);
            }
        }
        return minCost;
    }
}



// public class p9 {
//     public static void main(String[] args) {
//         String s="abc";
//         int[] cost={10,5,8};
//         int c=0;
//         for(int i:cost){
//             c+=i;
//         }
//         int[] charArr=new int[26];
//         for(int i=0;i<s.length();i++){
//             int index=s.charAt(i)-'a';
//             charArr[index]+=cost[i];
//         }
//         int minCost=Integer.MAX_VALUE;
//         for(int i=0;i<26;i++){
//             if(charArr[i]>0){
//                 minCost=Math.min(minCost,c-charArr[i]);
//             }
//         }
//         System.out.println(minCost);
//     }
// }