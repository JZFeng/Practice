package leetCode.medium;

import leetCode.utility.ListNode;

public class DeleteDuplicates
{

    public static void main(String[] args)
    {
        ListNode head = ListNode.buildListFromArray(new int[] { 1, 1, 1, 3, 4, 4, 5 });

        ListNode.printList(deleteDuplicates(head));

    }

    public static ListNode deleteDuplicates(ListNode head)
    {
        if (head == null)
            return head;
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode pre = helper;
        ListNode cur = head;
        while (cur != null)
        {
            while (cur.next != null && pre.next.val == cur.next.val)
            {
                cur = cur.next;
            }
            if (pre.next == cur)
            {
                pre = pre.next;
            }
            else
            {
                pre.next = cur.next;
            }
            cur = cur.next;
        }

        return helper.next;
    }
}
