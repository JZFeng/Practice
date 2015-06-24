package leetCode.easy;

import leetCode.utility.ListNode;

public class RemoveElements
{

    public static void main(String[] args)
    {
        /*
         * ListNode head = ListNode.buildListFromArray(new int[]{1,2,6,3,4,5,6}); ListNode.printList(head);
         * System.out.println(); ListNode.printList(removeElements(head, 6));
         */

        System.out.println(removeElement1(new int[] { 1, 2, 6, 3, 4, 5, 6 }, 6));
    }

    public static ListNode removeElements(ListNode head, int val)
    {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = head;
        while (cur != null)
        {
            if (cur.val == val)
            {
                cur = cur.next;
                pre.next = cur;
            }
            else
            {
                pre = cur;
                cur = cur.next;
            }
        }

        return dummyHead.next;

    }

    // double pointers, pos pointing to previous one, cur pointing to current node.
    public static int removeElement(int[] nums, int elem)
    {
        int pos = 0;
        for (int a : nums)
        {
            if (a != elem)
            {
                nums[pos] = a;
                pos++;
            }
        }

        return pos;
    }

    public static int removeElement1(int[] A, int elem)
    {
        int forwardScan = 0, backwardScan = A.length - 1;
        while (forwardScan <= backwardScan)
        {
            if (A[forwardScan] != elem)
                forwardScan++;
            else if (A[backwardScan] == elem)
                backwardScan--;
            else
            {
                A[forwardScan] = A[backwardScan];
                forwardScan++;
                backwardScan--;
            }
        }

        return backwardScan + 1;
    }

}
