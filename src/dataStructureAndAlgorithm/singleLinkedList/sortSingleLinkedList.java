package dataStructureAndAlgorithm.singleLinkedList;

public class sortSingleLinkedList
{

    /**
     * �Ե������������ ��ԭ�ȵĵ�������գ�Ȼ��ԭ���ĵ�����ӵ�1��Ԫ�ؿ�ʼ�����սڵ�Ԫ��ֵ�Ĵ�С���뵽�µĵ�������ȥ
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
        System.out.println("��������Ԫ�ص�ֵ��:");
        ll.insert(5, 100);
        print(ll);
        ll.sort();
        System.out.println("�����Ľ����:");
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
