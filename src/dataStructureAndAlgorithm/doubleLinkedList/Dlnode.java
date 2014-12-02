package dataStructureAndAlgorithm.doubleLinkedList;

public class Dlnode
{

    Dlnode prior;// 指向前驱的指针域
    Object data;// 数据域
    Dlnode next;// 指向后继的指针域

    public Dlnode(Dlnode prior, Object data, Dlnode next)
    {
        this.prior = prior;
        this.data = data;
        this.next = next;
    }

    public Dlnode()
    {
        this(null, null, null);
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

    public Dlnode getNext()
    {
        return next;
    }

    public void setNext(Dlnode next)
    {
        this.next = next;
    }

    public Dlnode getPrior()
    {
        return prior;
    }

    public void setPrior(Dlnode prior)
    {
        this.prior = prior;
    }
}


