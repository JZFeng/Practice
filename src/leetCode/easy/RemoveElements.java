package leetCode.easy;

import leetCode.utility.ListNode;

public class RemoveElements
{

    public static void main(String[] args)
    {
        ListNode head = ListNode.buildListFromArray(new int[]{1,2,6,3,4,5,6});
        ListNode.printList(head);
        System.out.println();
        ListNode.printList(removeElements(head, 6));

    }
    
    public static ListNode removeElements(ListNode head, int val)
    {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = head;
        while(cur != null)
        {
            if(cur.val == val)
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

}
