//Next Greater Element-2

import java.util.Arrays;
import java.util.Stack;

public class GreaterElement {
    public static void main(String[] args) {
        int[] a={1,2,3,4,3};
        int[] ans=new int[a.length];
        Stack<Integer> st=new Stack<>();
        for(int i=2*a.length-1;i>=0;i--){
            while (!st.isEmpty() && st.peek()<=a[i%a.length]) {
                st.pop();
            }
            if (i<a.length) {
                ans[i]=st.isEmpty()?-1:st.peek();
                // if (st.isEmpty()) {
                //     ans[i]=-1;
                // }else{
                //     ans[i]=st.peek();
                // }
            }
            st.push(a[i%a.length]);
        }
        System.out.println(Arrays.toString(ans));
    }
}
