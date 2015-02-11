package leetCode.medium;

import leetCode.utility.ListNode;

public class AddTwoNumbers
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        int carry = 0;
        int digit = 0;
        ListNode head = null;
        ListNode pre = null;
        while (l1 != null && l2 != null)
        {
            digit = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            ListNode newNode = new ListNode(digit);
            if (head == null)
                head = newNode;
            else
                pre.next = newNode;
            pre = newNode;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null)
        {
            digit = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;
            ListNode newNode = new ListNode(digit);
            if (head == null)
                head = newNode;
            else
                pre.next = newNode;
            pre = newNode;
            l1 = l1.next;
        }
        while (l2 != null)
        {
            digit = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            ListNode newNode = new ListNode(digit);
            if (head == null)
                head = newNode;
            else
                pre.next = newNode;
            pre = newNode;
            l2 = l2.next;
        }
        if (carry > 0)
        {
            ListNode newNode = new ListNode(carry);
            pre.next = newNode;
        }
        return head;
    }
}
