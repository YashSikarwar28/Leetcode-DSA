//Previous Smaller Element - GFG

import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public static ArrayList<Integer> prevSmaller(int[] a) {
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty() && a[i]<=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(-1);
            }
            else{
                ans.add(st.peek());
            }
            st.push(a[i]);
        }
        return ans;
    }
}