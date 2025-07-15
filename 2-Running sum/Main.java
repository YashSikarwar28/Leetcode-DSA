

class Solution {
    public int[] runningSum(int[] nums) {
        int[] b = new int[nums.length];
        int sum = 0;
        for(int i=0;i<b.length;i++){
            sum=sum+nums[i];
            b[i]=sum;
        }
        return b;
    }
}