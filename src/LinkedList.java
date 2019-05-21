public class LinkedList
{
    private Node head;
    private int count;
    private boolean singlyLinked;
    private boolean circular;
    Class<?> fixedClass;

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
        this(singly,circ,Object.class);
    }
    public LinkedList(boolean singly, boolean circ, Class<?> T)
    {
        fixedClass = T;
        singlyLinked = singly;
        circular = circ;
    }

    public void insert(Node n)
    {
        if(!fixedClass.isAssignableFrom(n.getData().getClass()))
        {
            System.out.println("please insert only data from the following class - " + fixedClass + " " + n.getData() + " is invalid");
            return;
        }
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
                getLastNode().setNextNode(n);
                //head.getPrevNode().setNextNode(n);
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

    //inserting a node of any datatype
    //generic class T is used in this method
    //checking of whether the datatype is allowed in this list is handled by the other insert method
    public <T> void insert(T cls)
    {
        Node<T> node = new Node<>(cls);
        insert(node);
    }

    public Node getLastNode()
    {
        Node temp = head;
        while(!(temp.getNextNode() == null || temp.getNextNode() == head))
        {
            temp = temp.getNextNode();
        }
        return temp;
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
    public Class<?> getFixedClass()
    {
        return fixedClass;
    }

    public void setSinglyLinked(boolean var)
    {
        if(var == singlyLinked)
        {
            if(singlyLinked) //if(singlyLinked == true)
            {
                System.out.println("Linked list is already singly linked");
            }
            else
            {
                System.out.println("Linked list is already doubly linked");
            }
            return;
        }

        singlyLinked = var;

        if(var) //set singly linked to true
        {
            Node temp = head;
            while(!(temp.getNextNode() == head || temp.getNextNode() == null))
            {
                temp.setPrevNode(null);
                temp = temp.getNextNode();
            }
            temp.setPrevNode(null);
        }
        else
        {
            Node temp = head;
            Node ahead = temp.getNextNode();
            if(ahead == null || temp == null)
            {
                return;
            }

            while(!(temp.getNextNode() == head || temp.getNextNode() == null))
            {
                if(ahead == null)
                {
                    return;
                }
                ahead.setPrevNode(temp);
                temp = temp.getNextNode();
                ahead = ahead.getNextNode();
            }
            if(temp.getNextNode() == head && ahead == head)
            {
                ahead.setPrevNode(temp);
            }
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

    public String printForward()
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

    public String printBackward()
    {
        if(singlyLinked)
        {
            System.out.println("Linked List is singly linked - Cannot print backwards");
            return null;
        }

        String output = "";
        //Node temp = head.getPrevNode();
        if(circular)
        {
            Node temp = head.getPrevNode();
            for(int i = 0;i<count;i++)
            {
                output = output + temp.toString();
                temp = temp.getPrevNode();
            }
        }
        else
        {
            Node temp = getLastNode();
            for(int i = 0;i<count;i++)
            {
                output = output + temp.toString();
                temp = temp.getPrevNode();
            }
        }
        return output;
    }

    public String toString()
    {
        return printBackward();
    }
}
