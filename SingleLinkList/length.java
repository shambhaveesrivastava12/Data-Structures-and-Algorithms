public class length { //calculates the length of the link list
    private ListNode head;
     private static class ListNode {
        private int data;
        private  ListNode next;

        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
     } 
     public int len()
     {
        if(head==null)
        {
            return 0;
        }
        int count=0;
        ListNode current = head;
        while(current!= null)
        {
            count++;
            current = current.next;
        }
        return count;
     }
     public void display(){
        ListNode current = head;
        while(current!= null)
        {
            System.out.print(current.data + " -> ");
            current=current.next;
        }
        System.out.println("null");
     }
     public static void main(String args[])
     {
        length obj =new length();
        obj.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        obj.head.next=second;
        second.next=third;
        third.next=fourth;

        obj.display();
        System.out.println("Length:" + obj.len());
     }

}
