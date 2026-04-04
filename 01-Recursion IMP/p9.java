class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> str=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        cc(k,n,str,ds,1);
        return str;        
    }
    private void cc(int k,int n,List<List<Integer>> str,List<Integer> ds,int ind){
        if(k==0){
            return;
        }
        if(n==0 && ds.size()==k){
            str.add(new ArrayList<>(ds));
            k--;
        }
        for(int i=ind;i<=9;i++){
            if(i>n) break;
            ds.add(i);
            cc(k,n-i,str,ds,i+1);
            ds.remove(ds.size()-1);
        }
    }
}