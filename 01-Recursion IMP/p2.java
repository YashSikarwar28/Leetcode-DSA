import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] a, int tar) {
        List<List<Integer>> ans=new ArrayList<>();
        combinations(a,tar,0,ans,new ArrayList<>());
        return ans;
    }
    static void combinations(int[] a,int tar,int ind,List<List<Integer>> ans,List<Integer> ds){
        if(ind==a.length){
            if(tar==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(a[ind]<=tar){
            ds.add(a[ind]);
            combinations(a,tar-a[ind],ind,ans,ds);
            ds.remove(ds.size()-1);
        }
        combinations(a,tar,ind+1,ans,ds);
    }
}

// import java.util.ArrayList;
// import java.util.List;

// public class p2 {
//     public static void main(String[] args) {
//         int[] a={2,3,6,7};
//         int tar=7;
//         System.out.println(findCombi(a, tar, 0, null, null););
//     }
//     static void findCombi(int[] a,int tar,int ind,List<List<Integer>> ans,List<Integer> ds){
//         if (ind==a.length) {
//             if (tar==0) {
//                 ans.add(new ArrayList<>(ds));
//             }
//             return;
//         }
//         if(a[ind]<=tar){
//             ds.add(a[ind]);
//             findCombi(a, tar-a[ind], ind, ans, ds);
//             ds.remove(ds.size()-1);
//         }
//         findCombi(a, tar, ind+1, ans, ds);
//     }
// }