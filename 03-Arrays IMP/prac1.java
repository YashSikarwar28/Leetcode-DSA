import java.util.Arrays;

class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hbars, int[] vbars) {
        Arrays.sort(hbars);
        Arrays.sort(vbars);
        int ans1=1;
        int ans2=1;
        int fi1=1;
        int fi2=1;
        for(int i=1;i<hbars.length;i++){
            if(hbars[i]-hbars[i-1]==1){
                ans1++;
            }
            else{
                ans1=1;
            }
            fi1=Math.max(fi1,ans1);
        }
        for(int i=1;i<vbars.length;i++){
            if(vbars[i]-vbars[i-1]==1){
                ans2++;
            }
            else{
                ans2=1;
            }
            fi2=Math.max(fi2,ans2);
        }
        int res=Math.min(fi2,fi1)+1;
        return res*res;
    }
}

// import java.util.Arrays;

// public class prac {
//     public static void main(String[] args) {
//         int n = 3;
//         int m = 2;
//         int[] hbars = { 3,2,4 };
//         int[] vbars = { 3,2 };
//         Arrays.sort(hbars);
//         Arrays.sort(vbars);
//         int max=1;
//         int ans1=1;
//         int max2=1;
//         int ans2=1;
//         int len = hbars.length > vbars.length ? hbars.length : vbars.length;
//         for (int i = 1; i < len; i++) {
//             if (hbars.length>1) {
//                 if (hbars[i]-hbars[i-1]==1) {
//                     max++;
//                     ans1=Math.max(ans1,max);
//                 }
//                 else{
//                     max=1;
//                 }
//             }
//             if (vbars.length>1) {
//                 if (vbars[i]-vbars[i-1]==1) {
//                     max2++;
//                     ans2=Math.max(ans2,max2);
//                 }
//                 else{
//                     max2=1;
//                 }
//             }
//         }
//         int fianl=Math.min(ans1+1,ans2+1);
//         System.out.println(fianl*fianl);
//     }
// }


//This is my original code which I coded first


// import java.util.Arrays;

// public class prac {
// public static void main(String[] args) {
// int n=3;
// int m=2;
// int[] a=new int[n+2];
// int[] b=new int[m+2];
// int hmax=0;
// int vmax=0;
// int[] hbars={3,2,4};
// int[] vbars={3,2};
// Arrays.sort(hbars);
// Arrays.sort(vbars);
// for (int i = 0; i < a.length; i++) {
// a[i]=i+1;
// }
// for(int i=0;i<b.length;i++){
// b[i]=i+1;
// }
// System.out.println(Arrays.toString(a));
// System.out.println(Arrays.toString(b));

// for(int i=0;i<hbars.length;i++){
// // if (hbars[i]==1 || hbars[i]==hbars.length) {
// // continue;
// // }
// int ind=hbars[i]-1;
// if (ind==0 || ind==a.length-1) {
// continue;
// }
// if (a[ind+1]-a[ind-1]>hmax) {
// hmax=a[ind+1]-a[ind-1];
// }
// }
// System.out.println(hmax);
// for(int i=0;i<vbars.length;i++){
// int ind=vbars[i]-1;
// if (ind==0 || ind==b.length-1) {
// continue;
// }
// if (b[ind+1]-b[ind-1]>vmax) {
// vmax=b[ind+1]-b[ind-1];
// }
// }
// System.out.println(vmax);
// System.out.println(hmax*vmax);
// }
// }
