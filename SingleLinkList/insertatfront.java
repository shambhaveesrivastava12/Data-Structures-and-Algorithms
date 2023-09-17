public class insertatfront { //insertion at beginning
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;
    

    public ListNode(int data)
    {
        this.data=data;
        this.next=null;
    }

}
public void display()
{
    ListNode current = head;
    while(current!=null)
    {
        System.out.print(current.data + " -> ");
        current=current.next;
    }
    System.out.println("null");
}

public void insertatfront(int value)
{
    ListNode newNode = new ListNode(value);
    newNode.next = head;
    head = newNode;
}
public static void main(String args[])
{
 insertatfront obj = new insertatfront();
 obj.head = new ListNode(12);
 ListNode first = new ListNode(14);
 ListNode second = new ListNode(18);
 ListNode third = new ListNode(19);


 obj.head.next=first;
 first.next=second;
 second.next=third;
 System.out.println("Before insertion a front:");
 obj.display();

 System.out.println("After insertion at front:");
 obj.insertatfront(23);
 obj.display();
}
}

//just a sample