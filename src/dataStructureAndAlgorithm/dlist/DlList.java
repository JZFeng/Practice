package dataStructureAndAlgorithm.dlist;

public class DlList
{
    Dlnode dlhead;// �����ͷ

    int size;
    public DlList()
    {
        dlhead = new Dlnode();
        dlhead.prior = dlhead;
        dlhead.next = dlhead;
        size = 0;
    }// ����һ���ձ�

    public DlList(Object[] a)
    {// ������a����һ��˫��ѭ������
        dlhead = new Dlnode();
        dlhead.prior = dlhead;
        dlhead.next = dlhead;
        Dlnode p = null;
        
/*        for (int i = a.length - 1; i >= 0; i--)
        {
            p = new Dlnode(dlhead, a[i], dlhead.next);
            dlhead.next.setPrior(p);
            dlhead.setNext(p);
            
            dlhead.next.prior = p;
            dlhead.next = p;
        }*/

        for(int i = 0; i<=a.length-1; i++)
        {
            addBefore(dlhead,a[i]);
        }
        size = a.length;

    }
    
    public void addBefore(Dlnode p, Object x)
    {
        Dlnode newNode = new Dlnode(p.prior, x, p);
        newNode.prior.next = newNode;
        p.prior = newNode;
    }
    
    

    public void clear()
    {
        dlhead = new Dlnode();
        dlhead.prior = dlhead;
        dlhead.next = dlhead;
    }

    /**
     * �ҵ�˫��ѭ�������е�i���ڵ� �׽ڵ��ǵ�0���ڵ㣬Ȼ�� �ǵ�1���ڵ㣬��������
     * 
     * @param i
     * @return
     */
    public Dlnode index(int i)
    {
        Dlnode p;
        int j;
        if (i < 0 || i > size)
            p = null;
        else if (i == 0)
            p = dlhead;
        else
        {
            p = dlhead.next;
            j = 1;
            while (j < i && p != null)
            {
                p = p.next;
                j++;

            }

        }

        return p;

    }

    /**
     * �õ���i���ڵ��dataֵ
     * 
     * @param i
     * @return
     */
    public Object get(int i)
    {
        Dlnode p;
        if (i <= 0 || i > size)
            return null;
        else
        {
            p = index(i);
            return p.getData();

        }

    }

    /**
     * ����˫��ѭ������ĳ���
     * 
     */

    public int len()
    {
        return size;
    }

    /**
     * �õ�data��Ϊel�Ľڵ�������
     * 
     * @param el
     * @return
     */
    public int loc(Object el)
    {
        Dlnode p;
        int j = 1;
        p = dlhead.next;
        while (!p.data.equals(el) && p != dlhead)
        {// ˫��ѭ�����������������β������һ��ָ���Ƿ�ָ��ͷ���
            j++;
            p = p.next;

        }

        if (p != dlhead)
            return j;
        else
            return 0;

    }

    /**
     * ��һ�������ǲ����λ�� �ڶ��������ǲ���ڵ��dataֵ
     * 
     * @param loc
     * @param el
     * @return
     */
    public boolean insert(int loc, Object el)
    {
        if (loc < 1 && loc > size + 1)
            return false;
        Dlnode p = index(loc - 1);
        Dlnode q = new Dlnode(p, el, p.next);
        p.next.setPrior(q);
        p.setNext(q);
        size++;

        return true;

    }

    /**
     * ɾ����㣬�ṩɾ���ڵ��������
     * 
     */

    public Object delete(int i)
    {
        if (size == 0 || i < 1 || i > size)
            return null;
        Dlnode p = index(i);
        Object data = p.getData();
        p.prior.setNext(p.next);
        p.next.setPrior(p.prior);
        size--;
        return data;

    }

    public boolean empty()
    {
        return dlhead.next == dlhead;
    }

}




