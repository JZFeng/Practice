package dataStructureAndAlgorithm.singleLinkedList;

public class SingleLinkedlist
{
    Node head;

    int size;

    public SingleLinkedlist()
    {
        head = new Node();
        size = 0;
    }

    public SingleLinkedlist(Object[] a)
    {
        head = new Node();
        Node p = null;
        for (int i = a.length - 1; i >= 0; i--)
        {
            p = new Node(a[i], head.next);
            head.next = p;

        }

        size = a.length;
    }


    public void clear()
    {
        head = new Node();
        size = 0;
    }

    public Node nodeAtIndex(int index)
    {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Node p = head.next;

        for (int i = 0; i < index; i++)
        {
            p = p.next;
        }

        return p;

    }

    public int getSize()
    {
        return size;
    }

    /**
     * ���ؽڵ�ֵΪel�Ľڵ�������
     * 
     * @param el
     * @return
     */
    public int indexOf(Object obj)
    {
        int index = 0;
        Node p = head.next;
        if(obj == null)
        {
            while(p != null)
            {
                if (p.getData() == null)
                    return index;
                p = p.next;
                index++;
            }
        }
        else
        {
            while(p != null)
            {
                if (obj.equals(p.getData()))
                    return index;
                p = p.next;
                index++;
            }
        }
        
        
        return -1;
    }

    public void add(int index, Object obj)
    {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        
        Node p = head.next;
        for(int i = 0 ; i < index -1; i++)
        {
            p = p.next;
        }
        
        Node newNode = new Node(obj, p.next);
        p.next = newNode;
        
        size++;
    }

    
    public void add(Object obj)
    {
        add(size, obj);
        
    }

    public Object remove(int index)
    {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Node p = head;
        for (int i = 0; i < index - 1; i++)
        {
            p = p.next;
        }

        Node removedNode = p.next;
        p.next = p.next.next;

        return removedNode;

    }


    public boolean empty()
    {
        return head.next == null;
    }

    
    public boolean contains(Object obj)
    {
        if(indexOf(obj) == -1)
            return false;
        
        return true;
        
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
