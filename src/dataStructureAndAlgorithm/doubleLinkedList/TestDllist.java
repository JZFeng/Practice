package dataStructureAndAlgorithm.doubleLinkedList;

public class TestDllist
{
    public static void main(String[] args)
    {
        Object[] a = {9,7,5,3,1};

        DoubleLinkedList dl = new DoubleLinkedList(a);

        print(dl);

    }

    public static void print(DoubleLinkedList dl)
    {
       Dlnode p = dl.dlhead.next;
       while ( p != dl.dlhead)
       {
           System.out.println(p.getData());
           p = p.next;
       }

    }
}