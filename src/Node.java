public class Node<DataType>
{
    //variables
    private DataType data;

    private Node nextNode;
    private Node prevNode;

    //constructors
    public Node()
    {
        data = null;
        nextNode = null;
        prevNode = null;
    }
    public Node(DataType info)
    {
        setData(info);
        nextNode = null;
        prevNode = null;
    }
    public Node(DataType info, Node next, Node prev)
    {
        setData(info);
        setNextNode(next);
        setPrevNode(prev);
    }
    public Node(Node copy) //copy constructor
    {
        setData((DataType)copy.getData());
        setNextNode(copy.getNextNode());
        setPrevNode(copy.getPrevNode());
    }

    //getters
    public DataType getData()
    {
        return data;
    }
    public Node getNextNode()
    {
        return nextNode;
    }
    public Node getPrevNode()
    {
        return prevNode;
    }

    //setters
    public void setData(DataType info)
    {
        data = info;
    }
    public void setNextNode(Node next)
    {
        nextNode = next;
    }
    public void setPrevNode(Node prev)
    {
        prevNode = prev;
    }

    //operators
    public boolean equals(Node n)
    {
        if(n.getData().equals(getData()))
        {
            return true;
        }
        return false;
    }

    public void swap(Node n)
    {
        DataType temp = getData();
        setData((DataType)n.getData());
        n.setData(temp);
    }

    //toString
    public String toString()
    {
        return data.toString();
    }
}
