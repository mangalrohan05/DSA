class Node {
    Node prev;
    int data;
    Node next;

    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this(null, data, null);
    }

}

public class root {
    public static Node insert(Node head, int data) {

        Node res = new Node(data);

        res.next = head;

        if (head != null)
            head.prev = res;

        return res;
    }
}
