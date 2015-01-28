package leetCode;

import java.util.Iterator;

public class MergeTwoLists
{

    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(-1);
        l2.next = new ListNode(4);
        ListNode head = mergeTwoLists(l1, l2);
        
        while(head!=null)
        {
            System.out.print(head.val +",");
            head = head.next;
        }

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
