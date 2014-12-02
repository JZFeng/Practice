package dataStructureAndAlgorithm.singleLinkedList;

public class Node
{
    Object data;
    Node next;

    public Node(Object data, Node n)
    {
        this.data = data;
        next = n;
    }// ����һ�����ݺͽڵ����һ��ָ��

    public Node()
    {
        this(null, null);
    }
    // ������Ϊ�գ���һ��ָ��Ϊ��

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

    public Node getNext()
    {
        return next;
    }// �õ���һ���ڵ��ָ��

    public void setNext(Node n)
    {
        next = n;
    }// ������һ���ڵ��ָ��

}