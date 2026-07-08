class Node {
    int data;
    Node prev, next;

    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this(null, data, null);
    }
}

public class reverse_a_LL {

    public static Node insert(Node head, int data) {
        Node temp = new Node(data);

        if (head != null)
            head.prev = temp;
        
        temp.next = head;

        return temp;
    }

    public static Node reverseNode(Node head) {
        Node curr = head;
        Node last = null;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;

            last = curr;

            curr = curr.prev;
        }

        return last;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head = null;
        for (int x : arr) {
            head = insert(head, x);
        }

        head = reverseNode(head);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
