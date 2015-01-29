package leetCode.easy;

public class ReverseLinkedList
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ListNode head = new ListNode(3);
        head.next = new ListNode(5);
        head.next.next = new ListNode(7);

        printList(head);
        
        ListNode tmp = reverseLinkedList(head);
        
        printList(tmp);

    }

    public static void printList(ListNode head)
    {
        while(head != null)
        {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode reverseLinkedList(ListNode head)
    {
        if(head == null)
            return head;
        
        ListNode p1, p2, p3;
        p1 = head;
        p2 = p1.next;
        
        while(p2 != null)
        {
            p3 = p2.next;
            
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        
        head.next = null;
       
        return p1;
    }
}
