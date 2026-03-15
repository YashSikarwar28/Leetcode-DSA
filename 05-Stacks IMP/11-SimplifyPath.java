//LeetCode 71

import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] parts = path.split("/");
        for (String p : parts) {
            if (p.equals("") || p.equals("."))
                continue;
            if (p.equals("..")) {
                if (!st.isEmpty())
                    st.pop();
            } else {
                st.push(p);
            }
        }
        if (st.isEmpty())
            return "/";
        StringBuilder ans = new StringBuilder();
        for (String s : st) {
            ans.append("/").append(s);
        }
        return ans.toString();
    }
}

// import java.util.Stack;

// public class Main {
// public static void main(String[] args) {
// Stack<Character> st = new Stack<>();
// String str = "";
// String a = "/.../a/../b/c/../d/./";
// int i = a.length() - 1;
// while (i >= 0) {
// if (a.charAt(i) == '/' && str.isEmpty()) {
// i--;
// } else if (a.charAt(i) == '.') {
// i -= 2;
// } else {
// str += a.charAt(i);
// i--;
// }
// }
// System.out.println(str);
// }
// }