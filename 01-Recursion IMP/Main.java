//LC 17 - Letter Combination of phone

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String d) {
        List<String> ans=new ArrayList<>();
        if(d.length()==0) return ans;
        String[] map={
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        combi("",d,map,ans);
        return ans;
    }
    void combi(String curr,String digit,String[] map,List<String> ans){
        if(digit.isEmpty()){
            ans.add(curr);
            return;
        }
        int d=digit.charAt(0)-'0';
        for(char ch:map[d].toCharArray()){
            combi(curr+ch,digit.substring(1),map,ans);
        }
    }
}


// import java.util.ArrayList;
// public class Main {
//     public static void main(String[] args) {
//         System.out.println(combi("", "23"));
//     }
//     static ArrayList<String> combi(String a,String b){
//         if (b.isEmpty()) {
//             ArrayList<String> ans=new ArrayList<>();
//             ans.add(a);
//             return ans;
//         }
//         int digit=b.charAt(0)-'0'; // '2' int0 2
        
//         ArrayList<String> ans=new ArrayList<>();
//         for(int i=(digit-1)*3;i<digit*3;i++){
//             char ch=(char)('a'+i);
//             ans.addAll(combi(a+ch, b.substring(1)));
//         }
//         return ans;
//     }
// }

