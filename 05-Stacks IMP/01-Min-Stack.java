//One stack for pushing the value and the other one for storing the minimum value of the stack

import java.util.Stack;

class MinStack {
    Stack<Integer> st;
    Stack<Integer> stmin;
    public MinStack() {
        st=new Stack<>();
        stmin=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(stmin.isEmpty() || val<=stmin.peek()){
            stmin.push(val);
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        int n=st.pop();
        if(n==stmin.peek()){
            stmin.pop();
        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        return st.peek();
    }
    
    public int getMin() {
        return stmin.peek();
    }
}