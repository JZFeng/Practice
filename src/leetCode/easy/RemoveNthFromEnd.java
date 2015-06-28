package leetCode.easy;

import leetCode.utility.ListNode;

public class RemoveNthFromEnd
{

    public static void main(String[] args)
    {
        ListNode head = ListNode.buildListFromArray(new int[]{1,2,6,3,4,5,6});
        ListNode.printList(head);
        System.out.println();
        ListNode.printList(removeNthFromEnd(head, 6));

    }

    public static ListNode removeNthFromEnd(ListNode head, int n)
    {
        if (head == null)
        {
            return head;
        }

        ListNode dummy = new ListNode(1);
        ListNode i = dummy;
        ListNode j = dummy;
        dummy.next = head;
        int count = 0;

        while (count != n)
        {
            j = j.next;
            count++;
        }

        while (j.next != null)
        {
            i = i.next;
            j = j.next;
        }

        i.next = i.next.next;

        return dummy.next;

    }
}
