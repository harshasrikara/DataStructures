/*

Author: Harsha Srikara
Date Created: May 16 2019

This Node class will be used by both the linked list classes as well as the binary tree classes
 */

public class Node<DataType extends Comparable<DataType>>  implements Comparable<DataType>
{
    //variables
    private DataType data;

    private Node<DataType> nextNode; //also left
    private Node<DataType> prevNode; //also right

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
    public Node(DataType info, Node<DataType> next, Node<DataType> prev)
    {
        setData(info);
        setNextNode(next);
        setPrevNode(prev);
    }
    public Node(Node<DataType> copy) //copy constructor
    {
        setData(copy.getData());
        setNextNode(copy.getNextNode());
        setPrevNode(copy.getPrevNode());
    }

    //getters
    public DataType getData()
    {
        return data;
    }
    public Node<DataType> getNextNode()
    {
        return nextNode;
    }
    public Node<DataType> getPrevNode()
    {
        return prevNode;
    }

    //setters
    public void setData(DataType info)
    {
        data = info;
    }
    public void setNextNode(Node<DataType> next)
    {
        nextNode = next;
    }
    public void setPrevNode(Node<DataType> prev)
    {
        prevNode = prev;
    }

    //redundant setters and getter for binary tree class
    //these setters and getters perform the same functions as setNextNode/getNextNode etc
    //however they address the variable as leftNode and rightNode instead
    //Thus, it is more obvious as to what is happening in the binary tree

    public void setLeftNode(Node<DataType> left)
    {
        prevNode = left;
    }
    public void setRightNode(Node<DataType> right)
    {
        nextNode = right;
    }
    public Node<DataType> getLeftNode()
    {
        return prevNode;
    }
    public Node<DataType> getRightNode()
    {
        return nextNode;
    }

    //operators
    public boolean equals(Node<DataType> n)
    {
        if(n.getData().equals(getData()))
        {
            return true;
        }
        return false;
    }

    public void swap(Node<DataType> n)
    {
        DataType temp = getData();
        setData((DataType)n.getData());
        n.setData(temp);
    }


    public int compareTo(DataType node)
    {
        if(getData() == node)
        {
            return 1;
        }
        return 0;
    }


    //toString
    public String toString()
    {
        return data.toString();
    }
}
