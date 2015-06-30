package leetCode.easy;

import leetCode.utility.ListNode;
/*
 Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 */
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
