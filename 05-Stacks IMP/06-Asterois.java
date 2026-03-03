import java.util.Arrays;
import java.util.Stack;

public class Asterois {
    public static void main(String[] args) {
        int[] a={4,7,1,1,2,-3,-7,17,15,-16};
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<a.length;i++){
            boolean destroy=false;
            while (!st.isEmpty() && st.peek()>0 && a[i]<0) {
                if (Math.abs(st.peek())<Math.abs(a[i])) {
                    st.pop();
                }else if (Math.abs(st.peek())==Math.abs(a[i])) {
                    st.pop();
                    destroy=true;
                    break;
                }
                else {
                    destroy=true;
                    break;
                }
            }
            if (!destroy) {
                st.push(a[i]);
            }
        }
        System.out.println(st);
        int[] arr=new int[st.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=st.peek();
            st.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}




// import java.util.ArrayList;
// import java.util.Stack;

// public class Asterois {
//     public static void main(String[] args) {
//         int[] a={5,10,-5};
//         Stack<Integer> st=new Stack<>();
//         ArrayList<Integer> arr=new ArrayList<>();
//         st.push(a[a.length-1]);a
//         for (int i = a.length-2; i>=0; i--) {
//             if(a[i]>0 && Math.abs(st.peek())<a[i]){
//                 st.pop();
//                 st.push(a[i]);
//             }else if(a[i]>0 && Math.abs(st.peek())>a[i]) continue;
//             else if(a[i]>0 && Math.abs(st.peek())==a[i]) st.pop();
//             else{
//                 st.push(a[i]);
//             }
//         }
//         System.out.println(st);
//     }
// }
