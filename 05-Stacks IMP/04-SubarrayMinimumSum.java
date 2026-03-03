//Generate smallest number towards left and right for that particular index and then multiply both the values and then multiply the resultant value with that particular number at that index.

import java.util.Stack;

class Solution {
    int mod=(int)1e9+7;
    public int sumSubarrayMins(int[] arr) {
        int[] left=leftmin(arr);
        int[] right=rightmin(arr);
        long sum=0;
        for(int i=0;i<arr.length;i++){
            long leftind=i-left[i];
            long rightind=right[i]-i;
            long prod=(leftind*rightind)%mod;
            long indprod=(arr[i]*prod)%mod;
            sum=(sum+indprod)%mod;
        }
        return (int)sum;
    }
    public int[] leftmin(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] l=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                l[i]=-1;
            }else{
                l[i]=st.peek();
            }
            st.push(i);
        }
        return l;
    }
    public int[] rightmin(int[] arr){
        int[] r=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                r[i]=arr.length;
            }else{
                r[i]=st.peek();
            }
            st.push(i);
        }
        return r;
    }
}