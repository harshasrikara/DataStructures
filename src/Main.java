public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        LinkedList linkedList = new LinkedList(false,false);
        Node<Integer> node1 = new Node<>(3);
        Node<String> node2 = new Node<>("stringify");
        Node<Integer> node3 = new Node<>(5);
        Node<Integer> node4 = new Node<>(6);

        linkedList.insert(node1);

        linkedList.insert(node2);

        linkedList.insert(node3);

        linkedList.insert(node4);

        linkedList.insert("bob");

        linkedList.insert(12.53);

        //linkedList.setSinglyLinked(true);

        System.out.println(linkedList.printForward());

        System.out.println(linkedList.printBackward());




    }
}
