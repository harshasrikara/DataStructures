public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        LinkedList linkedList = new LinkedList(false,true, Integer.class);
        Node<Integer> node1 = new Node<>(3);
        Node<String> node2 = new Node<>("stringify");
        Node<Integer> node3 = new Node<>(5);
        Node<Integer> node4 = new Node<>(6);

        linkedList.insert(node1);

        linkedList.insert(node2);

        linkedList.insert(node3);

        linkedList.insert(node4);

        Integer obj = 5;
        String b = new String("sddvdvw");

        if(obj.getClass().isAssignableFrom(b.getClass()))
        {
            System.out.println("they are the same");
        }

        Class<String> something = String.class;
        Class thisThing = String.class;
        Class<?> whatThis = String.class;

        System.out.println(linkedList);
        System.out.println(linkedList.getFixedClass());


    }
}
