/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        ListNode t1=l1;
        ListNode t2=l2;
        int car=0;
        while(t1!=null || t2!=null){
            int sum=car;
            if(t1!=null){
                sum+=t1.val;
            }
            if(t2!=null){
                sum+=t2.val;
            }
            ListNode l=new ListNode(sum%10);
            car=sum/10;
            curr.next=l;
            curr=curr.next;
            if(t1!=null){
                t1=t1.next;
            }
            if(t2!=null){
                t2=t2.next;
            }
        }
        if(car==1){
            ListNode l=new ListNode(1);
            curr.next=l;
        }
        return dummy.next;
    }
}