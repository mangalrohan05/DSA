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

public class reverse {

    public static Node insert(Node node, int data) {
        Node head = new Node(data);

        head.next = node;

        if (node != null)
            node.prev = head;

        return head;
    }

    public static Node reverseNode(Node head) {

        Node curr = head;
        Node temp = null;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev;
        }

        if (temp != null)
            head = temp.prev;

        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        Node node = null;

        for (int x : arr) {
            node = insert(node, x);
        }

        // while (node != null) {
        //     System.out.print(node.data + " ");
        //     node = node.next;
        // }

        node = reverseNode(node);

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}