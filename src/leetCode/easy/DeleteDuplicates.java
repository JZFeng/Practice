package leetCode.easy;
/*
 Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */

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
