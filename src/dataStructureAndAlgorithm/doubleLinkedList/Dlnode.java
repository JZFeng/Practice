package dataStructureAndAlgorithm.doubleLinkedList;

public class Dlnode
{

    Dlnode prior;// ָ��ǰ����ָ����
    Object data;// ������
    Dlnode next;// ָ���̵�ָ����

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


