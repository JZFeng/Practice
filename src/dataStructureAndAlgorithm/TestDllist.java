package dataStructureAndAlgorithm;

public class TestDllist
{
    public static void main(String[] args)
    {

        DlList dl = new DlList();

        for (int i = 0; i < 10; i++)
            dl.insert((i + 1), new Integer(i + 1));
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