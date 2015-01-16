package dataStructureAndAlgorithm.doubleLinkedList;

public class Dlnode
{

    Dlnode prev;// ָ��ǰ����ָ����
    Object data;// ������
    Dlnode next;// ָ���̵�ָ����

    
    
    public Dlnode(Dlnode prior, Object data, Dlnode next)
    {
        this.prev = prior;
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
        return prev;
    }

    public void setPrior(Dlnode prior)
    {
        this.prev = prior;
    }
}


