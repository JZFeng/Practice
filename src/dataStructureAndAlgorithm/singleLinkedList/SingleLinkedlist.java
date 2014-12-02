package dataStructureAndAlgorithm.singleLinkedList;

public class SingleLinkedlist
{
    Node head;

    int size;

    public SingleLinkedlist()
    {
        head = new Node();
        size = 0;
    }// 有表头节点的单链表

    public SingleLinkedlist(Object[] a)
    {
        head = new Node();
        Node p;
        for (int i = a.length - 1; i >= 0; i--)
        {// 倒着建立表，从最后一个元素向前建立单链表
            //Add after head.
            p = new Node(a[i], head.next);
            head.setNext(p);

        }

        size = a.length;

    }

    /**
     * 清空操作
     */

    public void clear()
    {
        head = new Node();
        size = 0;
    }

    /**
     * 求链表中第i号节点
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
     * 返回第i个节点的数据域
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
     * 返回单链表的长度
     * 
     * @return
     */
    public int length()
    {
        return size;
    }

    /**
     * 返回节点值为el的节点索引号
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
     * 单链表的插入 在位置loc位置之前插入节点数据域为el的节点
     */

    public boolean insert(int loc, Object el)
    {
        if (loc < 1 || loc > size + 1)
            return false;
        Node p = index(loc - 1);// 找到loc-1处的节点进行插入
        p.setNext(new Node(el, p.next));
        size++;
        return true;

    }

    /**
     * 删除操作 删除节点号为i的节点 首结点的节点号为0,依次类推 首结点不能删除
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
     * 判断是单链表是否为空
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
        p = head.next;// 取得单链表中的第一个节点
        head.next = null;// 将原先的单链表置空
        while (p != null)
        {
            s = p;
            p = p.next;
            sorts(s);

        }

    }

    // 对单链表中的元素进行排序

    public void sorts(Node s)
    {
        Node p, q;
        Object data = s.getData();
        if (head.next == null
                || ((Integer) data).intValue() <= ((Integer) head.next.data).intValue())
        {
            // 插入的元素始终是最小的
            s.next = head.next;
            head.next = s;

        }

        else
        {// 节点q始终指向p的前驱
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
