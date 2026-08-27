class Solution {
    int[] ans;
    public int[] nextGreaterElement(int[] a, int[] b) {
        ans=new int[a.length];
        Stack<Integer> st=new Stack<>();
        int[] c=new int[b.length];
        for(int i=b.length-1;i>=0;i--){
            while(!st.isEmpty() && b[i]>st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                c[i]=-1;
            }
            else{
                c[i]=st.peek();
            }
            st.push(b[i]);
        }
        int ind=0;
        check(b,ind,a,c);
        return ans;
    }
    private void check(int[] b,int ind,int[] a,int[] c){
        if(ind==a.length) return;
        for(int i=0;i<b.length;i++){
            if(a[ind]==b[i]){
                ans[ind]=c[i];
                ind++;
                break;
            }
        }
        check(b,ind,a,c);
    }
}
