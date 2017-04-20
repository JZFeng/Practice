package dataStructure.doubleLinkedList;

import java.util.Iterator;

public class DoubleLinkedList implements Iterable
{
    Dlnode dlhead;

    int size;
    
    int modAmount = 0;

    public DoubleLinkedList()
    {
        dlhead = new Dlnode();
        dlhead.prev = dlhead;
        dlhead.next = dlhead;
        size = 0;
    }

    public DoubleLinkedList(Object[] a)
    {
        dlhead = new Dlnode();
        dlhead.prev = dlhead;
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
        Dlnode newNode = new Dlnode(p.prev, x, p);
        newNode.prev.next = newNode;
        p.prev = newNode;
        size++;
        modAmount++;

    }

    public void addAfter(Dlnode p, Object x)
    {
        Dlnode newNode = new Dlnode(p, x, p.next);
        p.next.prev = newNode;
        p.next = newNode;
        modAmount++;
    }

    public void clear()
    {
        dlhead = new Dlnode();
        dlhead.prev = dlhead;
        dlhead.next = dlhead;
        size = 0;
    }

    // normal solution.

    // better solution
    public Dlnode getNodeAtIndex(int index)
    {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Dlnode p = dlhead;

        /*
         * for (int i = 0; i <= index; i++) { p = p.next; }
         */

        if (index < (size >> 1))
            for (int i = 0; i <= index; i++)
            {
                p = p.next;
            }

        else
        {
            for (int i = size; i > index; i--)
            {
                p = p.prev;
            }

        }

        return p;

    }

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
     * remove the node at specified index
     */
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
        p.prev.next = p.next;
        p.next.prev = p.prev;

        size--;
        modAmount++;
        return removedNode;
    }
    
    /** remove a node */
    public Object remove(Dlnode p)
    {

        Dlnode removedNode = p;

        p.prev.next = p.next;
        p.next.prev = p.prev;

        size--;
        modAmount++;
        
        return removedNode;
    }
    
    

    public boolean empty()
    {
        return dlhead.next == dlhead;
    }

    public Iterator iterator()
    {
        return new DoubleLinkedListIterator();
    }
    
    //inner class
    private class DoubleLinkedListIterator implements Iterator
    {
        private int iteratorModAmount = modAmount;
        
        Dlnode current = dlhead.next;
        
        boolean okToRemove = false;
        

        public boolean hasNext()
        {
            return (current != dlhead );
        }

 
        public Object next()
        {
            if(modAmount != iteratorModAmount)
                throw new java.util.ConcurrentModificationException();
            if(!hasNext())
                throw new java.util.NoSuchElementException();
            
            Object p = current.getData();
            current = current.next;
            okToRemove = true;
            return p;
        }

        public void remove()
        {
            if(modAmount != iteratorModAmount)
                throw new java.util.ConcurrentModificationException();
            if(!okToRemove)
                throw new IllegalStateException();
            
            DoubleLinkedList.this.remove(current.prev);
            okToRemove = false;
            iteratorModAmount++;
            
        }
        
    }

}
