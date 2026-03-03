//Question similar to previous question only thing is that we have to now calculate subarray maximum sum and then take the difference of it.

class Solution {
    public long subArrayRanges(int[] arr) {
        int[] ls=leftsmall(arr);
        int[] rs=rightsmall(arr);
        int[] lg=leftgreater(arr);
        int[] rg=rightgreater(arr);
        long diff=0;
        for(int i=0;i<arr.length;i++){
            long a=i-ls[i];
            long b=rs[i]-i;
            long c=i-lg[i];
            long d=rg[i]-i;
            long p1=a*b;
            long p2=c*d;
            long ans1=arr[i]*p1;
            long ans2=arr[i]*p2;
            diff+=ans2-ans1;
        }
        return diff;
    }
    public int[] leftsmall(int[] arr){
        int[] ls=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            ls[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return ls;
    }
    public int[] rightsmall(int[] arr){
        int[] rs=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            rs[i]=st.isEmpty()?arr.length:st.peek();
            st.push(i);
        }
        return rs;
    }
    public int[] leftgreater(int[] arr){
        int[] lg=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            lg[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return lg;
    }
    public int[] rightgreater(int[] arr){
        int[] rg=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            rg[i]=st.isEmpty()?arr.length:st.peek();
            st.push(i);
        }
        return rg;
    }
}