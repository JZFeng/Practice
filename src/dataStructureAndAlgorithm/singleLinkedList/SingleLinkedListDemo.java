package dataStructureAndAlgorithm.singleLinkedList;

public class SingleLinkedListDemo
{

    /**
     * 对单链表进行排序 将原先的单链表清空，然后将原来的单链表从第1个元素开始，按照节点元素值的大小插入到新的单链表中去
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Object[] a =
        { 9, 7, 5, 3 };
        SingleLinkedlist linklist = new SingleLinkedlist(a);
        linklist.remove(0);
        print(linklist);
    }

    public static void print(SingleLinkedlist ll)
    {
        Node p = ll.head.next;
        while(p!= null)
        {
            System.out.println(p.getData());
            p = p.next;
        }
    
    }

}
