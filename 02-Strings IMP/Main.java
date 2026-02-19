class Solution {
    public int countBinarySubstrings(String s) {
        int ans=0;
        int prev=0;
        int curr=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)) curr++;
            else{
                ans+=Math.min(prev,curr);
                prev=curr;
                curr=1;
            }
        }
        ans+=Math.min(prev,curr);
        return ans;
    }
}



// public class Main {
//     public static void main(String[] args) {
//         String s="00110011";
//         int prev=0;
//         int curr=1;
//         int ans=0;
//         for(int i=1;i<s.length();i++){
//             if (s.charAt(i)==s.charAt(i-1)) {
//                 curr++;
//             }
//             else{
//                 ans+=Math.min(prev,curr);
//                 prev=curr;
//                 curr=1;
//             }
//         }
//         ans+=Math.min(prev,curr);
//         System.out.println(ans);
//     }
// }
