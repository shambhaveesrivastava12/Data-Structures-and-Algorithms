public class deleteatposition {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display()
{
    ListNode current = head;
    while(current!=null)
    {
    System.out.print(current.data + "->");
    current=current.next;
    }
    System.out.println("null");
}

public void delete(int position){
    if(position==1){
        head=head.next;
    }
    else{
        ListNode previous= head;
        int count=1;
        while(count<position-1){
            previous=previous.next;
            count++;
        }
        ListNode current = previous.next;
        previous.next=current.next;
    }
}
public static void main(String args[])
{
    deletelast obj = new deletelast();
    obj.insertatfront(2);
    obj.insertatfront(7);
    obj.insertatfront(8);
    obj.insertatfront(11);
    System.out.println("Before deletion:");
    obj.display(); 
    System.out.println(obj.deleteatlast());
    System.out.println("After deletion:");
    obj.display();
}
}
