//LeetCode 150 - Stack

class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<t.length;i++){
            if(t[i].equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(a+b);
            }
            else if(t[i].equals("-")){
                int a=st.pop();
                int b=st.pop();
                st.push(b-a);
            }
            else if(t[i].equals("*")){
                int a=st.pop();
                int b=st.pop();
                st.push(b*a);
            }
            else if(t[i].equals("/")){
                int a=st.pop();
                int b=st.pop();
                st.push(b/a);
            }else{
                st.push(Integer.parseInt(t[i]));
            }
        }
        return st.pop();
    }
}



// import java.util.Stack;

// public class main {
//     public static void main(String[] args) {
//         String[] a={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
//         Stack<Integer> st=new Stack<>();
//         int ans=0;
//         for(int i=0;i<a.length;i++){
//             boolean check=false;
//             int c=0;
//             if (a[i]=="+") {
//                 while (!st.isEmpty() && c!=2) {
//                     int b=st.pop();
//                     c++;
//                     int d=st.pop();
//                     c++;
//                     st.push(b+d);
//                 }
//                 check=true;
//             }
//             if (a[i]=="*") {
//                 while (!st.isEmpty() && c!=2) {
//                     int b=st.pop();
//                     c++;
//                     int d=st.pop();
//                     c++;
//                     st.push(b*d);
//                 }
//                 check=true;
//             }
//             if (a[i]=="-") {
//                 while (!st.isEmpty() && c!=2) {
//                     int b=st.pop();
//                     c++;
//                     int d=st.pop();
//                     c++;
//                     st.push(d-b);
//                 }
//                 check=true;
//             }
//             if (a[i]=="/") {
//                 while (!st.isEmpty() && c!=2) {
//                     int b=st.pop();
//                     c++;
//                     int d=st.pop();
//                     c++;
//                     st.push(d/b);
//                 }
//                 check=true;
//             }
//             if (check==false) {
//                 st.push(Integer.parseInt(a[i]));
//             }
//         }
//         System.out.println(st.pop());
//     }
// }
