//This is my approach, approach is to go to the left node and reverse it normally like we do in reverse question by taking a null pointer and reversing the nodes.

//Then for connecting, we will take the previous node from where the reversal started and connect that node with the reversed node and for the last node we will take a tail pointer because after reversal the node will point to null as we do in normal LL reversal and traverse on the reversed nodes and when it becomes null we will connect it to the last node after reversal.
//Go to left reverse the node pair using while loop and then connect the reversed pair with the previous reverse nodes and after reverse nodes!!
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=head;
        for(int i=1;i<left;i++){
            curr=curr.next;
        }
        int count=left;
        ListNode prev=null;
        //reversal
        while(count<=right){
            ListNode n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
            count++;            
        }
        ListNode before=dummy;
        //node before reversal
        for(int i=1;i<left;i++){
            before=before.next;
        }
        ListNode after=curr;
        //connecting the node before reversal
        before.next=prev;
        //connecting the node after taaversal
        ListNode tail=prev;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=after;
        return dummy.next;
    }
}



class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
         ListNode prev=dummy;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        //ListNode temp=curr;
         ListNode curr=prev.next;
        for(int i=1;i<=right-left;i++){
            //ListNode next=curr.next;
            ListNode temp=prev.next;
            prev.next=curr.next;
            curr.next=curr.next.next;
            prev.next.next=temp;
        }
        return dummy.next;
    }
}
