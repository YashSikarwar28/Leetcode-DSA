//Combination Sum 2
//Time Complexity = 2^n * k
//Space Complexity = k * x


class Solution {
    public List<List<Integer>> combinationSum2(int[] a, int tar) {
        Arrays.sort(a);
        List<List<Integer>> ans=new ArrayList<>();
        answer(a,tar,0,ans,new ArrayList<>());
        return ans;
    }
    static void answer(int[] a,int tar,int ind,List<List<Integer>> ans,List<Integer> ds){
        if(tar==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<a.length;i++){
            if(i>ind && a[i]==a[i-1]) continue;
            if(a[i]>tar) break;

            ds.add(a[i]);
            answer(a,tar-a[i],i+1,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}


// import java.util.ArrayList;
// import java.util.Arrays;

// public class p2 {
//     public static void main(String[] args) {
//         int[] a = { 1, 1, 1, 2, 2 };
//         Arrays.sort(a);
//         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//         answer(a, 4, 0, ans, new ArrayList<>());
//         System.out.println(ans);
//     }

//     static void answer(int[] a, int tar, int ind, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds) {
//         if (tar == 0) {
//             ans.add(new ArrayList<>(ds));
//             return;
//         }
//         for (int i = ind; i < a.length; i++) {
//             if (i > ind && a[i] == a[i - 1])
//                 continue;

//             if (a[i] > tar) {
//                 break;
//             }

//             ds.add(a[i]);
//             answer(a, tar - a[i], i + 1, ans, ds);
//             ds.remove(ds.size() - 1);

//         }
//     }
// }