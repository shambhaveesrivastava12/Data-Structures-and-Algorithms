public class deletelast {
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
public int length()
{
    if(head==null){
        return 0;
    }
    int count=0;
    ListNode current = head;
    while(current!=null)
    {
        count++;
        current=current.next;
    } 
    return count;
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
public void insertatfront(int value)
{
    ListNode newNode = new ListNode(value);
    newNode.next = head;
    head = newNode;
}
public ListNode deleteatlast(){
    if(head==null || head.next==null){
    return head;
}
    ListNode current = head;
    ListNode previous=null;
    while(current.next!=null){
    previous=current;
    current=current.next;
}
    previous.next=null;
    return current;
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

