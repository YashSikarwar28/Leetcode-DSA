//Combination Sum - Recursion

class Solution {
    public List<List<Integer>> combinationSum(int[] c, int tar) {
        List<List<Integer>> ans=new ArrayList<>();
        combi(tar,0,ans,c,new ArrayList<>());
        return ans;
    }
    static void combi(int tar,int ind,List<List<Integer>> ans,int[] c,List<Integer> ds){
        if(ind==c.length){
            if(tar==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(c[ind]<=tar){
            ds.add(c[ind]);
            combi(tar-c[ind],ind,ans,c,ds);
            ds.remove(ds.size()-1);
        }
        combi(tar,ind+1,ans,c,ds);
    }
}