package leetCode.easy;

import leetCode.utility.ListNode;

/*
 Write a program to find the node at which the intersection of two singly linked lists begins.

 

For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.

 

Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 
 */
public class IntersectionofTwoLinkedLists
{

    public static void main(String args[])
    {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(5);

        ListNode tmp = getIntersectionNode(l1, l2);

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        if (headA == null || headB == null)
            return null;

        int lenA = length(headA);
        int lenB = length(headB);

        if (lenA > lenB)
        {
            int steps = lenA - lenB;
            while (steps > 0)
            {
                headA = headA.next;
                steps--;
            }
        }
        else if (lenB > lenA)
        {
            int steps = lenB - lenA;
            while (steps > 0)
            {
                headB = headB.next;
                steps--;
            }
        }

        ListNode nodeA = headA;
        ListNode nodeB = headB;

        while (nodeA != null)
        {
            if (nodeA == nodeB)
                return nodeA;

            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }

        return null;
    }

    private static int length(ListNode head)
    {
        int len = 1;
        ListNode node = head;
        while (node.next != null)
        {
            node = node.next;
            len++;
        }

        return len;
    }
}
