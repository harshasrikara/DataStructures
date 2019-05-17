public class LinkedList
{
    private Node head;
    private int count;
    private boolean singlyLinked;
    private boolean circular;

    //constructors
    public LinkedList()
    {
        head = null;
        count = 0;
        singlyLinked = false;
        circular = false;
    }
    public LinkedList(Node n)
    {
        singlyLinked = false;
        circular = false;
        //insert(n);
    }
    public LinkedList(boolean singly, boolean circ)
    {
        singlyLinked = singly;
        circular = circ;
    }
    public LinkedList(Node n, boolean singly, boolean circ)
    {
        singlyLinked = singly;
        circular = circ;
        //insert(n);
    }

    public void insert(Node n)
    {
        if(empty())
        {
            head = n;
            if(circular)
            {
                head.setNextNode(head);
                head.setPrevNode(head);
            }
            else {
                head.setNextNode(null);
                head.setPrevNode(null);
            }
            incrementCount();
        }
    }
    public boolean empty()
    {
        if(count == 0)
        {
            return true;
        }
        return false;
    }
    public void incrementCount()
    {
        count++;
    }
}
