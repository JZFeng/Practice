package leetCode.easy;

public class DeleteDuplicates
{

    public static void main(String[] args)
    {
        ListNode head = new ListNode(10);
        head.next = new ListNode(10);
        head.next.next = new ListNode(10);
        
        
        

    }

    public ListNode deleteDuplicates(ListNode head)
    {
        ListNode n = head;
        while (n != null)
        {
            if (n.next != null && n.next.val == n.val)
            {
                n.next = n.next.next;
            }
            else
            {
                n = n.next;
            }
        }
        return head;
    }

    public static class ListNode
    {
        int val;

        ListNode next;

        ListNode(int x)
        {
            val = x;
            next = null;
        }
    }

}
