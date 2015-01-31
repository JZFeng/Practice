package leetCode.medium;

import leetCode.utility.ListNode;

public class ReverseLinkedListII
{

    public static void main(String[] args)
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next =new ListNode(5);
//        ListNode newHead = reverseLinkedListII(head, 2, 4);
        ListNode newHead = reverseLinkedListII(head, 1, 5);
        while(newHead != null)
        {
            System.out.print(newHead.val+", ");
            newHead = newHead.next;
        }

    }

    public static ListNode reverseLinkedListII(ListNode head, int m, int n)
    {

        ListNode before, start, end, after;
        before = after = start = end = null;
        ListNode ptr = head;
        for (int i = 1; i < m; i++)
        {
            before = ptr;
            ptr = ptr.next;
        }
        start = end = ptr;

        for (int i = m; i <= n; i++)
        {
            after = ptr.next;
            ptr.next = end; //reverse it
            end = ptr;  //move the pointer afterwards
            ptr = after; //move the pointer afterwards
        }
        if (before == null)
        {
            head = end;
        }
        else
        {
            before.next = end;
        }
        start.next = after;
        return head;

    }

}
