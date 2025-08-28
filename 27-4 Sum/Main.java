// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] a = { 1, 0, -1, 0, -2, 2 };
//         Arrays.sort(a);
//         System.out.println(Arrays.toString(a));
//         int tar = 0;
//         // for (int i = 0; i < a.length; i++) {
//         // int r=i+2;
//         // int l=a.length-1;
//         // while (r<l && r<a.length) {
//         // int closeSum=a[i]+a[i+1]+a[r]+a[l];
//         // if (closeSum==tar) {
//         // System.out.println(a[i]);
//         // System.out.println(a[i+1]);
//         // System.out.println(a[r]);
//         // System.out.println(a[l]);
//         // r++;
//         // l--;
//         // }
//         // if (closeSum<tar) {
//         // r++;
//         // }
//         // else{
//         // l--;
//         // }
//         // }
//         // }
//         for (int i = 0; i < a.length; i++) {
//             if (i > 0 && a[i] == a[i - 1])
//                 continue;
//             for (int j = i + 1; j < a.length; j++) {
//                 if (j > i + 1 && a[j] == a[j - 1])
//                     continue;
//                 int r = j + 1;
//                 int l = a.length - 1;
//                 while (r < l) {
//                     int sum = a[i] + a[j] + a[r] + a[l];
//                     if (sum == tar) {
//                         System.out.println(a[i]);
//                         System.out.println(a[j]);
//                         System.out.println(a[r]);
//                         System.out.println(a[l]);
//                         r++;
//                         l--;
//                     } else if (sum < tar) {
//                         r++;
//                     } else {
//                         l--;
//                     }
//                 }
//             }
//         }
//     }
// }

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] a, int tar) {
        List<List<Integer>> ab = new ArrayList()<>();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(i>0 && a[i]==a[i-1]) continue;
            for(int j=i+1;j<a.length;j++){
                if(j>i+1 && a[j]==a[j-1]) continue;
                int l=j+1;
                int r=a.length-1;
                while(l<r){
                long sum=(long)a[i]+a[j]+a[r]+a[l];
                    if(sum==tar){
                        ab.add(Arrays.asList(a[i],a[j],a[l],a[r]));
                        while(l<r && a[l]==a[l+1])  l++;
                        while(l<r && a[r]==a[r-1]) r--;
                        l++;
                        r--;
                    }
                    else if(sum<tar){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }   
        return ab;
    }
}