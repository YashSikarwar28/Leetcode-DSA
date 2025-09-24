class Solution {
    public boolean canJump(int[] n) {
        int sum=0;
        for(int i=0;i<n.length;i++){
            if(i>sum) return false;
            sum=Math.max(sum,i+n[i]);
        }
        return true;
    }
}