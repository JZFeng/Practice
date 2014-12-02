package dataStructureAndAlgorithm.dlist;

public class TestDllist
{
    public static void main(String[] args)
    {
        Object[] a = {9,7,5,3,1};

        DlList dl = new DlList(a);

        print(dl);
    }

    public static void print(DlList dl)
    {
        System.out.println("双向循环链表遍历结果:");
        Dlnode p;
        p = dl.dlhead.next;
        while (p != dl.dlhead)
        {
            System.out.print(p.getData() + " ");
            p = p.next;
        }

    }
}