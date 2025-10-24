class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> a=new HashSet<>();
        int l=0;
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            while(a.contains(nums[i])){
                a.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            a.add(nums[i]);
            sum+=nums[i];
            max=Math.max(sum,max);
        }
        return max;
    }
}