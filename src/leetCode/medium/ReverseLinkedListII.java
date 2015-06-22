package leetCode.medium;

import leetCode.utility.ListNode;
/*
 Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 ≤ m ≤ n ≤ length of list.
 */
public class ReverseLinkedListII
{

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        ListNode head = ListNode.buildListFromArray(arr);
        ListNode newHead = reverseLinkedListII(head, 2, 4);
        ListNode.printList(newHead);
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
