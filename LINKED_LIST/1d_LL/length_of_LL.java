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

public class length_of_LL {

    public static int findLength(Node node) {
        int length = 0;

        while (node != null) {
            length++;
            node = node.next;
        }

        return length;
    }

    public static Node insert(Node a, int data) {
        Node head = new Node(data);
        head.next = a;

        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6 };

        Node head = null;

        for (int x : arr)
            head = insert(head, x);

        System.out.println(findLength(head));
    }
}
