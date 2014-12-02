package dataStructureAndAlgorithm.singleLinkedList;

public class sortSingleLinkedList
{

    /**
     * 对单链表进行排序 将原先的单链表清空，然后将原来的单链表从第1个元素开始，按照节点元素值的大小插入到新的单链表中去
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Object[] a = {9,7,5,3};
        SingleLinkedlist linklist = new SingleLinkedlist(a);
        print(linklist);
        System.out.println();
        
        
        SingleLinkedlist ll = new SingleLinkedlist();
        for (int i = 0; i < 10; i++)
            ll.insert(i + 1, new Integer(i + 1));
        System.out.println("单链表中元素的值是:");
        ll.insert(5, 100);
        print(ll);
        ll.sort();
        System.out.println("排序后的结果是:");
        print(ll);

    }

    public static void print(SingleLinkedlist ll)
    {
        Node p = ll.head.next;
        while (p != null)
        {
            System.out.print(p.getData() + " ");
            p = p.next;
        }

    }

}
