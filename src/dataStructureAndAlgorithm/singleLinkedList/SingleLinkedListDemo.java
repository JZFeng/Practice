package dataStructureAndAlgorithm.singleLinkedList;

public class SingleLinkedListDemo
{

    /**
     * �Ե������������ ��ԭ�ȵĵ�������գ�Ȼ��ԭ���ĵ�����ӵ�1��Ԫ�ؿ�ʼ�����սڵ�Ԫ��ֵ�Ĵ�С���뵽�µĵ�������ȥ
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
