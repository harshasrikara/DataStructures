public class Main {

    public static void main(String[] args)
    {
        //System.out.println("Hello World!");
        LinkedList linkedList = new LinkedList(false,false);

        Node<Integer> node1 = new Node<>(3);
        Node<String> node2 = new Node<>("stringify");
        Node<Integer> node3 = new Node<>(5);
        Node<Integer> node4 = new Node<>(6);
        Node<Double> node5 = new Node<>(12.33);


        linkedList.insert(node1);
        linkedList.insert(node2);
        linkedList.insert(node3);
        linkedList.insert(node4);
        linkedList.insert(node5);

        linkedList.insert(1.234);
        linkedList.insert("bob");
        linkedList.insert(12.53);

        /*This error appears to only be occuring when trying to remove doubles
         * The remove method successfully removes ints and string and all other stuff
          * without any issues
          * I have tested the code on all the types of linked Lists I made - singly, doubly, circular etc
          * I tried inserting the double 12.33 by first creating a node like in this example and also directly
          * Neither seems to work. */


        //System.out.println(linkedList.filter(Double.class).printForward());

        System.out.println(linkedList.printForward());

        //System.out.println(linkedList.printBackward());

        //System.out.println(linkedList.find(3));

        System.out.println(linkedList.get(7));

    }
}
