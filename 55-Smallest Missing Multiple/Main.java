import java.util.Arrays;

class Solution {
    public int missingMultiple(int[] a, int k) {
        int[] b=new int[a.length];
        for(int i=0;i<a.length;i++){
            if(a[i]%k==0){
                b[i]=a[i]/k;
            }
        }
        Arrays.sort(b);
        int d=1;
        for(int i=0;i<b.length;i++){
            if(b[i]==d){
                d++;
            }
            else if(b[i]>d){
                break;
            }
        }
        return d*k;
    }
}



// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] a = {8,12} ;
//         int k = 4;
//         int[] b = new int[a.length];
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] % k == 0) {
//                 b[i] = a[i] / k;
//             }
//         }
//         Arrays.sort(b);
//         System.out.println(Arrays.toString(b));
//         int d = 0;
//         //if(b[b.length-1]==b.length-1) d=b.length;
        
//         for (int i = 1; i < b.length; i++) {
//             if (b[i] - b[i - 1] == 1)
//                 continue;
//             else if (b[i] - b[i - 1] != 1) {
//                 d=b[i-1]+1;
//             }
//         }
//         System.out.println(d * k);
//     }
// }
