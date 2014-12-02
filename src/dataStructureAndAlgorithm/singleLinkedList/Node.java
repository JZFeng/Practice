package dataStructureAndAlgorithm.singleLinkedList;

public class Node
{
    Object data;
    Node next;

    public Node(Object data, Node n)
    {
        this.data = data;
        next = n;
    }// 传递一个数据和节点的下一个指针

    public Node()
    {
        this(null, null);
    }
    // 数据域为空，下一个指针为空

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
    }// 得到下一个节点的指针

    public void setNext(Node n)
    {
        next = n;
    }// 设置下一个节点的指针

}