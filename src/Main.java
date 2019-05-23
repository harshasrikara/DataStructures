public class Main {

    public static void main(String[] args)
    {
        //System.out.println("Hello World!");
        LinkedList linkedList = new LinkedList(false,false);

        Node<Integer> node1 = new Node<>(3);
        Node<String> node2 = new Node<>("stringify");
        Node<Integer> node3 = new Node<>(5);
        Node<Integer> node4 = new Node<>(6);


        linkedList.insert(node1);
        linkedList.insert(node2);
        linkedList.insert(node3);
        linkedList.insert(node4);


        linkedList.insert(1.234);
        linkedList.insert("bob");
        linkedList.insert(12.53);

        /*This error appears to only be occuring when trying to remove doubles
         * The remove method successfully removes ints and string and all other stuff
          * without any issues
          * I have tested the code on all the types of linked Lists I made - singly, doubly, circular etc
          * I tried inserting the double 12.33 by first creating a node like in this example and also directly
          * Neither seems to work. */

        Node<Double> node5 = new Node<>(12.33);
        linkedList.insert(node5);

        if(node5.getData() == 12.33) //they are equal
        {
            System.out.println("They are equal");
        }
        //so if they are equal then why does one remove method work but not the other?
        //just to be clear, one might think oh the second doesnt work because you already removed it.
        //thats not the case, I just wrote both of them here but ran them seperatly

        //printing out node5.getData results in 12.33 getting printed
        linkedList.remove(node5.getData()); //this works

        linkedList.remove(12.33); //but this one doesnt work

        //System.out.println(linkedList.filter(Double.class).printForward());

        System.out.println(linkedList.printForward());

        //System.out.println(linkedList.printBackward());

        //System.out.println(linkedList.find(3));

    }
}
