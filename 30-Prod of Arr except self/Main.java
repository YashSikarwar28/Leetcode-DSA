// LC 238

class Solution {
    public int[] productExceptSelf(int[] n) {
        int[] pre=new int[n.length];
        pre[0]=1;
        int[] suff=new int[n.length];
        suff[n.length-1]=1;
        int[] ans=new int[n.length];
        // prefix loop
        for(int i=1;i<n.length;i++){
            pre[i]=pre[i-1]*n[i-1];
        }
        //suffix loop
        for(int i=n.length-2;i>=0;i--){
            suff[i]=suff[i+1]*n[i+1];
        }
        for(int i=0;i<n.length;i++){
            ans[i]=pre[i]*suff[i];
        }
        return ans;
    }
}