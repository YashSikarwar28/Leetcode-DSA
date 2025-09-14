class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(
            maxConsecutiveChar(answerKey, k, 'T'),
            maxConsecutiveChar(answerKey, k, 'F')
        );
    }

    private int maxConsecutiveChar(String s, int k, char target) {
        int left = 0;
        int maxLen = 0;
        int flipCount = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) != target) {
                flipCount++;
            }

            while (flipCount > k) {
                if (s.charAt(left) != target) {
                    flipCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}



// // LeetCode 2024
// //ttfftttttftffftffttt
// //k=3

// public class Main{
//     public static void main(String[] args) {
//         String a="fffttfttft";
//         //String a="ttfftttttftffftffttt";
//         char old = 'f';
//         char n = 't';
//         int k=3;
//         int c=0;
//         int fcount=0;
//         StringBuilder b = new StringBuilder();
//         StringBuilder f = new StringBuilder();

//         for (int i = 0; i <a.length(); i++) {
//             if (a.charAt(i)==old && c<k) {
//                 b.append(n);
//                 c++;
//             }
//             else{
//                 b.append(a.charAt(i));
//             }
//         }
//         for (int i = 0; i < a.length(); i++) {
//             if (a.charAt(i)=='t' && fcount<k) {
//                 f.append(old);
//                 fcount++;
//             }
//             else{
//                 f.append(a.charAt(i));
//             }
//         }
//         System.out.println(b.toString());
//         System.out.println(f.toString());

//         int l=0;
//         int r=1;
//         int occur=1;
//         while (r<a.length()) {
//             if (b.charAt(l)==b.charAt(r)) {
//                 l++;
//                 r++;
//                 occur++;
//             }
//             else if (b.charAt(r)!=b.charAt(l)) {
//                 break;
//             }
//             else{

//                 l++;
//                 r++;
//             }
//         }
//         int l1=0;
//         int r1=1;
//         int o1=1;
//         while (r1<a.length()) {
//             if (f.charAt(l1)==f.charAt(r1)) {
//                 l1++;
//                 r1++;
//                 o1++;
//             }
//             else if(f.charAt(r1)!=f.charAt(l1)){
//                 break;
//             }
//             else{
//                 l1++;
//                 r1++;
//             }
//         }

//         System.out.println(Math.max(occur, o1));
//     }
// }