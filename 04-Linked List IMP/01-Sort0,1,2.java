//Create seperate nodes for 0,1,2 and connect the nodes respectively according to the value of the node. In the end connect all the 3 nodes of 0,1,2 respectively to each other.

class Solution {
    public Node segregate(Node head) {
        Node zero=new Node(-1);
        Node one=new Node(-1);
        Node two=new Node(-1);
        Node z=zero;
        Node o=one;
        Node t=two;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }else if(temp.data==1){
                one.next=temp;
                one=one.next;
            }else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        zero.next=(o.next!=null)?o.next:t.next;
        one.next=(t.next!=null)?t.next:null;
        two.next=null;
        return (z.next!=null)?z.next:(o.next!=null)?o.next:t.next;
    }
}
