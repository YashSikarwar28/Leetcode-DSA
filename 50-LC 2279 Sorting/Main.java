class Solution {
    public int maximumBags(int[] c, int[] r, int a) {
        int[] n=new int[c.length];
        int count=0;
        for(int i=0;i<c.length;i++){
            n[i]=c[i]-r[i];
        }
        Arrays.sort(n);
        for(int i=0;i<c.length;i++){
            if(n[i]<=0){
                count++;
            }
            else if(a>=n[i]){
                a-=n[i];
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}




// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] c={2,3,4,5};
//         int[] r={1,2,4,4};
//         Arrays.sort(c);
//         Arrays.sort(r);
//         int count=0;
//         int rocks=2;
//         for(int i=0;i<c.length;i++){
//             int diff=c[i]-r[i];
//             if (diff<=0) {
//                 count++;
//             }
//             else if(rocks>=diff){
//                 rocks-=diff;
//                 count++;
//             }
//             else{
//                 break;
//             }
//         }
//         System.out.println(count);
//     }
// }
