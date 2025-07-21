
// public class Main {
//     public static void main(String[] args) {
//         int[] a = { 52,-91,72 };
//         int[] b = new int[a.length+1];
//         b[0] = 0;

//         for (int i = 2; i < b.length; i++) {
//             b[1]=a[0];
//             if(i==2){

//                 b[i]=a[i-2]+a[i-1];
//             }
//             else{
//                 b[i]=b[i-1]+a[i-1];
//             }
//         }

//         int max=0;
//         for (int i = 1; i < b.length; i++) {
//             if(b[i]>b[max]){
//                 max = i;
//             }
//         }
//         int d = b[max];
//         System.out.println(d);
//         System.out.println(Arrays.toString(b));

//           }
// }


class Solution {
    public int largestAltitude(int[] gain) {
        int[] b = new int[gain.length + 1];
        b[0] = 0;

        for (int i = 1; i < b.length; i++) {
            b[i] = b[i - 1] + gain[i - 1];
        }

        int max = 0;
        for (int i = 1; i < b.length; i++) {
            if (b[i] > b[max]) {
                max = i;
            }
        }

        int d = b[max];
        return d;
    }
}

