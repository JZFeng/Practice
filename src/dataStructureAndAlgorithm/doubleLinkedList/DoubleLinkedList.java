package dataStructureAndAlgorithm.doubleLinkedList;

public class DoubleLinkedList
{
    Dlnode dlhead;
    int size;

    public DoubleLinkedList()
    {
        dlhead = new Dlnode();
        dlhead.prior = dlhead;
        dlhead.next = dlhead;
        size = 0;
    }

    public DoubleLinkedList(Object[] a)
    {
        dlhead = new Dlnode();
        dlhead.prior = dlhead;
        dlhead.next = dlhead;

        Dlnode p = null;

        for (int i = a.length - 1; i >= 0; i--)
        {
            p = new Dlnode(dlhead, a[i], dlhead.next);
            dlhead.next.setPrior(p);
            dlhead.setNext(p);
        }

        /*
         * for(int i = 0; i<=a.length-1; i++) { addBefore(dlhead,a[i]); }
         */
        size = a.length;

    }

    public void addBefore(Dlnode p, Object x)
    {
        Dlnode newNode = new Dlnode(p.prior, x, p);
        p.prior = newNode;
        newNode.prior.next = newNode;
        size++;

    }

    public void clear()
    {
        dlhead = new Dlnode();
        dlhead.prior = dlhead;
        dlhead.next = dlhead;
        size = 0;
    }

    /**
     * 鎵惧埌鍙屽悜寰幆閾捐〃涓i涓妭鐐�棣栬妭鐐规槸绗�涓妭鐐癸紝鐒跺悗 鏄1涓妭鐐癸紝渚濇绫绘帹
     * 
     * @param index
     * @return
     */
    // normal solution.
    public Dlnode index(int index)
    {

        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Dlnode p = dlhead;

        for (int i = 0; i <= index; i++)
        {
            p = p.next;
        }

        return p;
    }

    // better solution
    public Dlnode getNodeAtIndex(int index)
    {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Dlnode p = dlhead;

        if (index < (size >> 1))
            for (int i = 0; i <= index; i++)
            {
                p = p.next;
            }

        else
        {
            for (int i = size; i > index; i--)
            {
                p = p.prior;
            }

        }

        return p;

    }

    /**
     * 寰楀埌绗琲涓妭鐐圭殑data鍊�
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
     * 璁＄畻鍙屽悜寰幆閾捐〃鐨勯暱搴�
     * 
     */

    public int len()
    {
        return size;
    }

    // get the index of an object.
    public int indexOf(Object o)
    {
        int index = 0;
        Dlnode p = dlhead.next;

        if (o == null)
        {
            while (p != dlhead)
            {
                if (p.data == null)
                    return index;
                p = p.next;
                index++;
            }
        }
        else
        {
            while (p != dlhead)
            {
                if (p.data.equals(o))
                    return index;
                p = p.next;
                index++;
            }
        }

        return -1;
    }

    public boolean contains(Object obj)
    {
        if (indexOf(obj) == -1)
            return false;
        return true;

    }

    /**
     * *
     * 
     * @param position //the position you want to add
     * @param obj //the element you want to add into the list
     */
    public void add(int position, Object obj)
    {
        if (position < 0 || position >= size)
            throw new IndexOutOfBoundsException();

        int index = 0;
        Dlnode p = dlhead;
        while (index <= position)
        {
            p = p.next;
            index++;
        }
        addBefore(p, obj);
        size++;
    }

    public void add(Object obj)
    {
        addBefore(dlhead, obj);
    }

    /*
     remove the node at specified index
     * */
    public Object remove(int index)
    {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Dlnode removedNode = null;
        Dlnode p = dlhead;

        for (int i = 0; i <= index; i++)
        {
            p = p.next;
        }

        removedNode = p;
        p.prior.next = p.next;
        p.next.prior = p.prior;

        size--;
        return removedNode;
    }

    public boolean empty()
    {
        return dlhead.next == dlhead;
    }
    
    

}
