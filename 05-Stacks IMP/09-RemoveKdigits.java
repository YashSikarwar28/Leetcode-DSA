import java.util.Stack;

class Solution {
    public String removeKdigits(String n, int k) {
        if(k==n.length()) return "0";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n.length();i++){
            while(!st.isEmpty() && k>0 && st.peek()-'0'>n.charAt(i)-'0'){
                st.pop();
                k--;
            }
            st.push(n.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}


// import java.util.Stack;

// public class RemoveKdigits {
//     public static void main(String[] args) {
//         String a="10200";
//         Stack<Character> st=new Stack<>();
//         int k=1;
//         for(int i=0;i<a.length();i++){
//             if (k==0) {
//                 break;
//             }
//             if (!st.isEmpty() && st.peek()-'0'>a.charAt(i)-'0') {
//                 st.pop();
//                 k--;
//             }
//             st.push(a.charAt(i));
//             System.out.println(st);
//         }
//     }
// }
