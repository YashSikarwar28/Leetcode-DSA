class Solution {
    public int[] dailyTemperatures(int[] a) {
        int[] arr=new int[a.length];
        Stack<Integer> st=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            while(!st.isEmpty() && a[st.peek()]<=a[i]){
                //arr[i]=0;
                st.pop();
            }
            if(!st.isEmpty() && a[st.peek()]>=a[i]){
                arr[i]=st.peek()-i;
            }else{
                arr[i]=0;
            }
            // if(st.isEmpty()){
            //     arr[i]=0;
            // }
            st.push(i);
        }
        return arr;
    }
}