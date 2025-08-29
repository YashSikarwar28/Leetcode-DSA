// LC 1051

class Solution {
    public int heightChecker(int[] a) {
        int[] b=new int[a.length];
        int c=0;
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                c++;
            }
        }
        return c;
    }
}



// import java.util.Arrays;

// public class Main{
//     public static void main(String[] args) {
//         int[] a={1,2,3,4,5};
//         int c=0;
//         int[] b=new int[a.length];
//         for (int i = 0; i < a.length; i++) {
//             b[i]=a[i];
//         }
//         System.out.println(Arrays.toString(b));
//         Arrays.sort(a);
//         for (int i = 0; i < b.length; i++) {
//             if (a[i]!=b[i]) {
//                 c++;
//             }
//         }
//         System.out.println(c);
//     }
// }