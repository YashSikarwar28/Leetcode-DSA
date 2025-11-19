//LC 2154 - very easy
class Solution {
    public int findFinalValue(int[] a, int o) {
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]==o){
                o*=2;
            }
            else if(a[i]>o){
                break;
            }
        }
        return o;
    }
}

// import java.util.Arrays;

// public class Main7 {
//     public static void main(String[] args) {
//         int[] a={5,3,6,1,12};
//         Arrays.sort(a);
//         int o=3;
//         for (int i = 0; i < a.length; i++) {
//             if (a[i]==o) {
//                 o=o*2;
//             }
//         }
//         System.out.println(o);
//     }
// }