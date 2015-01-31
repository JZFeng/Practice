package leetCode.easy;

import leetCode.utility.ListNode;

public class ReverseLinkedList
{

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        ListNode head = ListNode.buildListFromArray(arr);
        ListNode tmp = reverseLinkedList(head);
        ListNode.printList(tmp);
    }


    public static ListNode reverseLinkedList(ListNode head)
    {
        if(head == null)
            return head;
        
        ListNode ptr = head;
        ListNode end = head;
        while(ptr != null)
        {
            ListNode after = ptr.next;
            ptr.next = end;
            end = ptr;
            ptr = after;
        }
        head.next = null;
        return end;
    }
}
