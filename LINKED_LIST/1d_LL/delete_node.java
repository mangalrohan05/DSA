class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class delete_node {
    public void deleteNode(Node node) {

        node.data = node.next.data;

        node.next = node.next.next;
    }
}
