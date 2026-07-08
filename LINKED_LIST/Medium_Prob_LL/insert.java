class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this(data, null);
    }
}

public class insert {
    public static Node insertNode(Node head, int data) {
        Node node = new Node(data);

        node.next = head;

        return node;
    }
}
