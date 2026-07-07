
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

public class insert_at_head {

    public static Node insert(Node a, int data) {
        Node head = new Node(data);
        head.next = a;

        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6 };

        Node head = null;

        for(int x : arr)
            head = insert(head, x);

        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}