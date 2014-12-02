package dataStructureAndAlgorithm.doubleLinkedList;

public class TestDllist
{
    public static void main(String[] args)
    {
        Object[] a =
        { 9, 7, 5, 3, 1 };
        DoubleLinkedList dl = new DoubleLinkedList(a);
        dl.remove(3);
        print(dl);
        System.out.println("Size of the list is: " + dl.size);

        // System.out.println(dl.contains(11));
        // System.out.println(dl.indexOf(0));
        // System.out.println(dl.index(3).data);
        // System.out.println(dl.getNodeAtIndex(3).data);

    }

    public static void print(DoubleLinkedList dl)
    {
        Dlnode p = dl.dlhead.next;
        while (p != dl.dlhead)
        {
            System.out.println(p.data);
            p = p.next;
        }

    }
}
