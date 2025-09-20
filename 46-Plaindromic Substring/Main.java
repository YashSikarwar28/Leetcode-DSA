class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int maxLen=0;
        for(int i=1;i<s.length();i++){
            int l=i-1;
            int r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1>maxLen){
                    maxLen=r-l+1;
                    start=l;
                }
                l--;
                r++;
            }
            l=i-1;
            r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1>maxLen){
                    maxLen=r-l+1;
                    start=l;
                }
                l--;
                r++;
            }
    }
        return s.substring(start,start+maxLen);
}
}



// public class Main {
//     public static void main(String[] args) {
//         String s="babad";
//         StringBuilder b=new StringBuilder();
//         StringBuilder c=new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             b.append(s.charAt(i));
//             b.toString();
//             //System.out.println(b);
//             System.out.println(b);
//             if (b.length()>1) {
//                 for(int j=b.length()-1;j>=0;j--){
//                     c.append(b.charAt(j));
//                     System.out.println(c);
//                 }
//                 if (b.equals(c)) {
//                     System.out.println("True");
//                 }
//             }
//         }
//         // for(int i=s.length()-1;i>=0;i--){
//         //     b.append(s.charAt(i));
//         // }
//         // System.out.println(s.equals(b.toString()));
//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         String s="babad";
//         int max=0;
//         for(int i=0;i<s.length();i++){
//             for(int j=i+1;j<s.length();j++){
//                 String g=s.substring(i, j);
//                 if (Palin(g)) {
//                     System.out.println(g);
//                     max=Math.max(max, j-i);
//                 }
//             }
//         }
//         System.out.println(max);
//     }
//     static boolean Palin(String s){
//         int l=0;
//         int r=s.length()-1;
//         while (l<r) {
//             if (s.charAt(l)!=s.charAt(r)) {
//                 return false;
//             }
//             l++;
//             r--;
//         }
//         return true;
//     }
// }


