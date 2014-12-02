package dataStructureAndAlgorithm.singleLinkedList;

public class SingleLinkedlist
{
    Node head;

    int size;

    public SingleLinkedlist()
    {
        head = new Node();
        size = 0;
    }// �б�ͷ�ڵ�ĵ�����

    public SingleLinkedlist(Object[] a)
    {
        head = new Node();
        Node p;
        for (int i = a.length - 1; i >= 0; i--)
        {// ���Ž����������һ��Ԫ����ǰ����������
            //Add after head.
            p = new Node(a[i], head.next);
            head.setNext(p);

        }

        size = a.length;

    }

    /**
     * ��ղ���
     */

    public void clear()
    {
        head = new Node();
        size = 0;
    }

    /**
     * �������е�i�Žڵ�
     * 
     */

    public Node index(int i)
    {
        Node p = null;
        int j;
        if (i < 0 || i > size)
        {
            p = null;
        }
        else if (i == 0)
            p = head;
        else
        {
            j = 1;
            p = head.next;

            while (p != null && j < i)
            {

                p = p.next;
                j++;
            }

        }

        return p;

    }

    /***
     * ���ص�i���ڵ��������
     * 
     * @param i
     * @return
     */
    public Object get(int i)
    {

        if (i < 1 || i > size)
            return null;

        Node p = index(i);

        return p.getData();

    }

    /**
     * ���ص�����ĳ���
     * 
     * @return
     */
    public int length()
    {
        return size;
    }

    /**
     * ���ؽڵ�ֵΪel�Ľڵ�������
     * 
     * @param el
     * @return
     */
    public int loc(Object el)
    {
        Node p;
        int j = 1;
        p = head.next;

        while (p != null)
        {
            if (!p.data.equals(el))
            {

                p = p.next;
                j++;

            }

        }

        if (p != null)
            return j;
        else
            return 0;

    }

    /**
     * ������Ĳ��� ��λ��locλ��֮ǰ����ڵ�������Ϊel�Ľڵ�
     */

    public boolean insert(int loc, Object el)
    {
        if (loc < 1 || loc > size + 1)
            return false;
        Node p = index(loc - 1);// �ҵ�loc-1���Ľڵ���в���
        p.setNext(new Node(el, p.next));
        size++;
        return true;

    }

    /**
     * ɾ������ ɾ���ڵ��Ϊi�Ľڵ� �׽��Ľڵ��Ϊ0,�������� �׽�㲻��ɾ��
     */

    public Object delete(int i)
    {
        if (i < 1 || i > size || size == 0)
            return false;
        Node p = index(i - 1);
        Object el = p.next.getData();
        p.setNext(p.next.next);
        size--;
        return el;

    }

    /**
     * �ж��ǵ������Ƿ�Ϊ��
     * 
     * @return
     */
    public boolean empty()
    {
        return head.next == null;
    }

    public void sort()
    {
        Node p, s;
        p = head.next;// ȡ�õ������еĵ�һ���ڵ�
        head.next = null;// ��ԭ�ȵĵ������ÿ�
        while (p != null)
        {
            s = p;
            p = p.next;
            sorts(s);

        }

    }

    // �Ե������е�Ԫ�ؽ�������

    public void sorts(Node s)
    {
        Node p, q;
        Object data = s.getData();
        if (head.next == null
                || ((Integer) data).intValue() <= ((Integer) head.next.data).intValue())
        {
            // �����Ԫ��ʼ������С��
            s.next = head.next;
            head.next = s;

        }

        else
        {// �ڵ�qʼ��ָ��p��ǰ��
            p = head.next;
            q = null;
            while ((p != null)
                    && (((Integer) p.data).intValue() < ((Integer) data).intValue()))
            {
                q = p;
                p = p.next;
            }

            s.next = q.next;
            q.next = s;

        }

    }

}
