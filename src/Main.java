public class Main {

    public static void main(String[] args)
    {
        //System.out.println("Hello World!");
        LinkedList linkedList = new LinkedList(false,false);
        LinkedList linkedList1 = new LinkedList(false, true, Integer.class);
        LinkedList linkedList2 = new LinkedList();

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

        linkedList1.insert(4.23);
        linkedList1.insert(6);
        linkedList1.insert("alpha");

        linkedList2.insert("beta");

        /*This error appears to only be occuring when trying to remove doubles
         * The remove method successfully removes ints and string and all other stuff
          * without any issues
          * I have tested the code on all the types of linked Lists I made - singly, doubly, circular etc
          * I tried inserting the double 12.33 by first creating a node like in this example and also directly
          * Neither seems to work. */

        linkedList.setSinglyLinked(true);
        linkedList.setCircular(true);

        linkedList1.setSinglyLinked(false);
        linkedList1.setCircular(false);

        System.out.println(linkedList.filter(Integer.class).printBackward());

        System.out.println(linkedList1.filter(Double.class).printForward());

        System.out.println(linkedList.printForward());

        if(linkedList.remove("bob"))
        {
            System.out.println("bob was removed");
        }
        else
        {
            System.out.println("bob was not removed");
        }

        System.out.println(linkedList.printBackward());

        System.out.println(linkedList.find(3));

        System.out.println(linkedList.get(6));

    }
}
