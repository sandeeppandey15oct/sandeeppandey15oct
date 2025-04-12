public class LinkedListExample {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2);

        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        LinkedListApp.print(head);
    }
}

class LinkedListApp {
    public static void print(Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }
}

class Node {
    int data;

    public Node(int data) {
        this.data = data;
    }

    Node next;

}
