import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        Node node1 = LinkedList.configure1();
        Node node2 = LinkedList.configure2();
        List<Node> list1 = LinkedList.configure3();
        List<Node> list2 = LinkedList.configure4();

        System.out.println(isCircular(node1));
        System.out.println(isConnected(list1.get(0), list1.get(1)));
    }

    public static boolean isCircular(Node node) {
        return false;
    }

    public static boolean isConnected(Node node, Node node2) {
        return false;
    }
}
