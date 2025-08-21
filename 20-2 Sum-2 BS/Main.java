// Using Binary Search

// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] a={2,7,11,15};
//         System.out.println(Arrays.toString(search(a, 9)));
//     }
//     static int[] search(int[] a,int tar){
//         for (int i = 0; i < a.length; i++) {
//             int compliment=tar-a[i];
//             int j=BS(a, i+1, a.length-1, compliment);
//             if (j!=-1) {
//                 return new int[]{i+1,j+1};
//             }
//         }
//         return new int[]{-1,-1};
//     }
//     static int BS(int[] a,int s,int e,int tar){
//         while (s<=e) {
//             int mid = s+(e-s)/2;
//             if (a[mid]==tar) {
//                 return mid;
//             }
//             else if(tar<a[mid]){
//                 e=mid-1;
//             }
//             else{
//                 s=mid+1;
//             }
//         }
//         return -1;
//     }
// }



// Using 2 Pointer's

public class Main {

    public static void main(String[] args) {
        int[] a={2,7,11,15};
        int tar=9;
        int r=a[a.length-1];
        int l=a[0];
        while (l<r) {
            int sum=r+l;
            if (sum==tar) {
                System.out.println(r);
                System.out.println(l);
                break;
            }
            else if(sum>tar){
                r--;
            }
            else{
                l++;
            }
        }

    }
}