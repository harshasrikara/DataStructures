public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        LinkedList linkedList = new LinkedList(false,true);
        Node<Integer> node1 = new Node<>(3);
        Node<Integer> node2 = new Node<>(4);
        Node<Integer> node3 = new Node<>(5);
        Node<Integer> node4 = new Node<>(6);

        linkedList.insert(node1);
        System.out.println(linkedList.getHead());
        //System.out.println(linkedList.getHead().getPrevNode());
        //System.out.println(linkedList.getHead().getNextNode());
        linkedList.insert(node2);
        System.out.println(linkedList.getHead());
        //System.out.println(linkedList.getHead().getPrevNode());
        //System.out.println(linkedList.getHead().getNextNode());
        linkedList.insert(node3);
        System.out.println(linkedList.getHead());
        System.out.println(linkedList.getHead().getPrevNode());
        System.out.println(linkedList.getHead().getNextNode());
        linkedList.insert(node4);
        System.out.println(linkedList.getHead());

        System.out.println(linkedList.getCount());
        System.out.println(linkedList);
    }
}
