class Solution {
    public Node addOne(Node head) {
        Node temp=head;
        int b=add(temp);
        if(b==1){
            Node n=new Node(1);
            n.next=temp;
            return n;
        }
        return temp;
    }
    private int add(Node temp){
        if(temp==null) return 1;
        int a=add(temp.next);
        if(a==0) return 0;
        if(temp.data==9){
            temp.data=0;
            return 1;
        }
        temp.data=temp.data+1;
        return 0;
    }
}