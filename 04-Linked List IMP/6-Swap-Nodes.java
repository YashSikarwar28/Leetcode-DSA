//Before jumping to answer try to think visually connect nodes make diagram and use dummynode concept. Connect nodes according to the solution.
//We need pairs so the next and next to next pair should not be null
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode temp=dummy;
        while(temp.next!=null && temp.next.next!=null){
            ListNode first=temp.next;
            ListNode second=temp.next.next;

            first.next=second.next;
            second.next=first;

            temp.next=second;
            temp=first;
        }
        return dummy.next;
    }
}
