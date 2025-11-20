//LeetCode 387

class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}



// import java.util.Arrays;

// public class Main9 {
//     public static void main(String[] args) {
//         String s="loveleetcoede";
//         int[] freq=new int[26];
//         for(char c:s.toCharArray()){
//             freq[c-'a']++;
//         }
//         for (int i = 0; i < s.length(); i++) {
//             if (freq[s.charAt(i)-'a']==1) {
//                 System.out.println(s.charAt(i));
//                 break;
//             }
//         }
//     }
// }