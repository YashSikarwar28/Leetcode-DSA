class Solution {
    ListNode curr;
    public boolean isPalindrome(ListNode head) {
        curr=head;
        return check(head);
    }
    private boolean check(ListNode head){
        if(head==null) return true;
        boolean ans=check(head.next);
        if(!ans) return false;
        if(curr.val!=head.val) return false;
        curr=curr.next;
        return ans;
    }
}