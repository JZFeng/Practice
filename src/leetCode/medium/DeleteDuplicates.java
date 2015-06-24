package leetCode.medium;

import leetCode.utility.ListNode;
/*
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 
 其实道理还是一样，只是现在要把前驱指针指向上一个不重复的元素中，如果找到不重复元素，则把前驱指针知道该元素，否则删除此元素。算法只需要一遍扫描，时间复杂度是O(n)，空间只需要几个辅助指针，是O(1)。
 */

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
