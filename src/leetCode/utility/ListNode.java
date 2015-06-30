package leetCode.utility;

public class ListNode
{
    public int val;

    public ListNode next;

    public ListNode(int x)
    {
        val = x;
        next = null;
    }
    
    public static ListNode buildListFromArray(int[] arr)
    {
        if(arr == null || arr.length ==0)
            throw new IllegalArgumentException("Invalid Int Array.");
        
        ListNode head = new ListNode(arr[0]);
        int length = arr.length;
        ListNode cur = head;
        for(int i = 1; i < length; i++)
        {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        
        return head;
    }
    
    public static void printList(ListNode head)
    {
        if(head == null)
            return;
        
        while(head != null)
        {
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
    
    
    
}