class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k<=1) return head;
        return rev(head,k);
    }
    private ListNode rev(ListNode head,int k){
        //if(head==null || head.next==null) return head;
        ListNode temp=head;
        for(int i=0;i<k;i++){
            if(temp==null) return head;
            temp=temp.next;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        for(int i=0;i<k;i++){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=rev(temp,k);
        return prev;
    }
}