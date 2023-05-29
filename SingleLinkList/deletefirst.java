public class deletefirst
{
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
public ListNode deletefirst(){
if(head==null){
    return null;
}
ListNode temp = head;
head= head.next;
temp.next=null;
return temp;
}
public static void main(String args[])
{
    deletefirst obj = new deletefirst();
    obj.insertatfront(2);
    obj.insertatfront(7);
    obj.insertatfront(8);
    obj.insertatfront(11);
    System.out.println("Before deletion:");
    obj.display();
    System.out.println(obj.deletefirst());
    System.out.println("After deletion:");
    obj.display();
}
}