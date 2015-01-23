package dataStructure.singleLinkedList;

public class SingleLinkedListDemo
{
    public static void main(String[] args)
    {
        Object[] a = { 9, 7, 5, 3 };
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
