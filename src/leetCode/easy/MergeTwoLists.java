package leetCode.easy;

import leetCode.utility.ListNode;

/*
 Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoLists
{

    public static void main(String[] args)
    {
        ListNode l1 = ListNode.buildListFromArray(new int[]{-1,2,3,5,7});
        ListNode l2 = ListNode.buildListFromArray(new int[]{-2,1,4,6});
        ListNode.printList(mergeTwoLists(l1, l2));

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        if (l1 == null && l2 == null)
        {
            return null;
        }
        if (l1 == null)
        {
            return l2;
        }
        if (l2 == null)
        {
            return l1;
        }

        ListNode dummyHead, currentNode;
        dummyHead = new ListNode(0);
        currentNode = dummyHead;

        while (l1 != null && l2 != null)
        {
            if (l1.val <= l2.val)
            {
                currentNode.next = l1;
                l1 = l1.next;
            }
            else
            {
                currentNode.next = l2;
                l2 = l2.next;
            }

            currentNode = currentNode.next;
        }

        if (l1 != null)
        {
            currentNode.next = l1;
        }

        if (l2 != null)
        {
            currentNode.next = l2;
        }

        return dummyHead.next;

    }

}
