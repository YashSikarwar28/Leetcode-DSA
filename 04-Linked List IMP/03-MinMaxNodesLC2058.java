//Easy logic only take care of the positon for storing the min and max, store the first min/max value and then take another variable for updating the min/max and computing the difference.
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int min=Integer.MAX_VALUE;
        int max=-1;
        int prev=-1;
        int pos=1;
        int firstPos=-1;
        ListNode temp=head;
        while(temp!=null && temp.next!=null && temp.next.next!=null){
            int i=temp.next.val;
            if((i>temp.next.next.val && i>temp.val) || (i<temp.next.next.val && i<temp.val)){
                if(firstPos==-1){
                    firstPos=pos;
                }
                if(prev!=-1){
                    min=Math.min(min,pos-prev);
                }
                prev=pos;
            }
            temp=temp.next;
            pos++;
        }
        max=prev-firstPos;
        if(prev==firstPos || firstPos==-1){
            return new int[]{-1,-1};
        }
        return new int[]{min,max};
    }
}
