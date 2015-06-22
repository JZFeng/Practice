package leetCode.easy;

import leetCode.utility.ListNode;
/*
 Reverse a singly linked list.
 */
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
    {/*
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
    */
        if (head == null)
            return null;

        if(head.next == null)
            return head;

        ListNode current = head;

        while (current.next != null){
            //get the next node
            ListNode temp = current.next;

            //take the next node out of the chain and set current's next node to its next node
            current.next = temp.next;

            //now make the node we took out to point to head  
            temp.next = head;

            //reassign the head
            head = temp;
        }

        return head;
    
    }
}
