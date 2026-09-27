class Solution {
    public String reverseParentheses(String s) {
        if (s.length() == 1)
            return s;
        StringBuilder ans = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ans.length());
            } else if (ch == ')') {
                int start = st.pop();
                StringBuilder temp = new StringBuilder(ans.substring(start));
                temp.reverse();
                ans.delete(start, ans.length());
                ans.append(temp);
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}

//This solution worked but was not efficient.
//In this we add characters in stack when we find ) we pop it and add character in a temp string while popping from the stack then we made a char array and again added the value in stack in this way the value gets reversed.
//Finally we added the values in anss string.

// class Solution {
//     public String reverseParentheses(String s) {
//         if(s.length()==1) return s;
//         Stack<Character> st=new Stack<>();
//         StringBuilder ans=new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             st.push(ch);
//             if(st.peek()==')'){
//                 st.pop();
//                 String str="";
//                 while(!st.isEmpty() && st.peek()!='('){
//                     str=str+st.pop();
//                 }
//                 st.pop();
//                 char[] cc=str.toCharArray();
//                 for(int j=0;j<cc.length;j++){
//                     st.push(cc[j]);
//                 }
//             }
//         }
//         while(!st.isEmpty()){
//             ans.append(st.pop());
//         }
//         return ans.reverse().toString();
//     }
// }
