//Push the indices in queue, if smaller element is present and the next element is bigger pop fom queue lese if bigger element is present keep it in queue.
//Storing the indices in deceasing order with the element at first being the greatest
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int[] ans=new int[nums.length-k+1];
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                ans[ind++]=nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}
