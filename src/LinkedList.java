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
        insert(n);
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
        insert(n);
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
            return;
        }

        if(singlyLinked)
        {
            if(circular)
            {
                if(getCount() == 1)
                {
                    n.setNextNode(head);
                    n.setPrevNode(null);
                    head.setNextNode(n);
                    head = n;
                    incrementCount();
                    return;
                }
                n.setNextNode(head);
                n.setPrevNode(null);
                head.getPrevNode().setNextNode(n);
                head = n;
                incrementCount();
            }
            else {
                n.setNextNode(head);
                n.setPrevNode(null);
                head = n;
                incrementCount();
            }
        }
        else
        {
            if(circular)
            {
                if(getCount() == 1) {
                    head.setPrevNode(n);
                    head.setNextNode(n);
                    n.setNextNode(head);
                    n.setPrevNode(head);
                    head = n;
                    incrementCount();
                    return;
                }

                n.setNextNode(head);
                n.setPrevNode(head.getPrevNode());
                head.getPrevNode().setNextNode(n);
                head.setPrevNode(n);
                head = n;
                incrementCount();
            }
            else {
                head.setPrevNode(n);
                n.setNextNode(head);
                n.setPrevNode(null);
                head = n;
                incrementCount();
            }
        }
    }


    public Node getHead()
    {
        return head;
    }
    public int getCount()
    {
        return count;
    }
    public boolean getSinglyLinked()
    {
        return singlyLinked;
    }
    public boolean getCircular()
    {
        return circular;
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

    public String toString()
    {
        String output = "";
        Node temp = head;
        if(circular)
        {
            for(int i = 0;i<count;i++)
            {
                output = output + temp.toString();
                temp = temp.getNextNode();
            }
        }
        else
        {
            for(int i = 0;i<count;i++)
            {
                output = output + temp.toString();
                temp = temp.getNextNode();
            }
        }
        return output;
    }
}
