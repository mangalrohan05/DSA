public class reverseLL {

    public static Node revNode(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head = null;

        for (int x : arr)
            head = insert.insertNode(head, x);

        head = revNode(head);

    }
}
