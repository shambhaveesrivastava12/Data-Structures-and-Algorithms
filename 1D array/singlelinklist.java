public class singlelinklist
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
    public static void main(String args[])
    {
        singlelinklist obj = new singlelinklist();
        obj.head= new ListNode(10);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(19);
        ListNode fourth = new ListNode(20);

        obj.head.next=second;
        second.next=third;
        third.next=fourth;
        
    }
    
}