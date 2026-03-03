import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] a) {
        int[] right=right(a);
        int[] left=left(a);
        long area=0;
        for(int i=0;i<a.length;i++){
            area=Math.max(area,a[i]*(right[i]-left[i]-1));
        }
        return (int)area;
    }
    public int[] left(int[] a){
        Stack<Integer> st=new Stack<>();
        int[] l=new int[a.length];
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty() && a[st.peek()]>a[i]){
                st.pop();
            }
            l[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return l;
    }
    public int[] right(int[] a){
        Stack<Integer> st=new Stack<>();
        int[] r=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            while(!st.isEmpty() && a[st.peek()]>=a[i]){
                st.pop();
            }
            r[i]=st.isEmpty()?a.length:st.peek();
            st.push(i);
        }
        return r;
    }
}



// import java.util.Stack;

// public class HistogramRectangle {
//     public static void main(String[] args) {
//         int[] a={2,1,5,6,2,3};
//         int[] left=pse(a);
//         int[] right=nse(a);
//         int area=0;
//         for(int i=0;i<a.length;i++){
//             area=Math.max(area, a[i]*(right[i]-left[i]-1));
//         }
//         System.out.println(area);
//     }
//     static int[] pse(int[] a){
//         Stack<Integer> st=new Stack<>();
//         int[] arr=new int[a.length];
//         for(int i=0;i<a.length;i++){
//             while (!st.isEmpty() && a[st.peek()]>a[i]) {
//                 st.pop();
//             }
//             arr[i]=st.isEmpty()?-1:st.peek();
//             st.push(i);
//         }
//         return arr;
//     }
//     static int[] nse(int[] a){
//         Stack<Integer> st=new Stack<>();
//         int[] arr=new int[a.length];
//         for(int i=a.length-1;i>=0;i--){
//             while(!st.isEmpty() && a[st.peek()]>=a[i]){
//                 st.pop();
//             }
//             arr[i]=st.isEmpty()?a.length:st.peek();
//             st.push(i);
//         }
//         return arr;
//     }
// }
