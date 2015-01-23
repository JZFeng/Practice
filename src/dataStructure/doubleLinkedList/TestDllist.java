package dataStructure.doubleLinkedList;

import java.util.Iterator;

public class TestDllist
{
    public static void main(String[] args)
    {
        Object[] a =
        { 9, 7, 5, 3, 1 };
        DoubleLinkedList dl = new DoubleLinkedList(a);
        
        Iterator itr = dl.iterator();
        while(itr.hasNext())
        {
            if(itr.next().equals(new Integer(3)))
                itr.remove();
        }

        print(dl);

    }

    public static void print(DoubleLinkedList dl)
    {
        Dlnode p = dl.dlhead.next;
        while (p != dl.dlhead)
        {
            System.out.println(p.data);
            p = p.next;
        }
        
/*        for (Object object : dl)
        {
            System.out.println(object);
        }*/
        

    }
}
