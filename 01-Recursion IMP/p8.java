//Permutation on Array
import java.util.ArrayList;

public class p8 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        boolean[] freq=new boolean[a.length];
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        permu(a, freq, ans, new ArrayList<>());
        System.out.println(ans);
    }
    static void permu(int[] a,boolean[] freq,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> ds){
        if (ds.size()==a.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<a.length;i++){
            if (!freq[i]) {
                freq[i]=true;
                ds.add(a[i]);
                permu(a,freq,ans,ds);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
}


//Leetcode 46

// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         boolean[] freq=new boolean[nums.length];
//         List<List<Integer>> ans=new ArrayList<>();
//         sum(nums,freq,ans,new ArrayList<>());
//         return ans;
//     }
//     static void sum(int[] nums,boolean[] freq,List<List<Integer>> ans,List<Integer> ds){
//         if(ds.size()==nums.length){
//             ans.add(new ArrayList<>(ds));
//             return;
//         }
//         for(int i=0;i<nums.length;i++){
//             if(!freq[i]){
//                 freq[i]=true;
//                 ds.add(nums[i]);
//                 sum(nums,freq,ans,ds);
//                 ds.remove(ds.size()-1);
//                 freq[i]=false;
//             }
//         }
//     }
// }
