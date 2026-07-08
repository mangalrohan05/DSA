
public class middle_of_ll {

    public static Node findMid(Node node) {
        Node prim = node;
        Node sec = node;

        while (sec != null && sec.next != null) {
            prim = prim.next;
            sec = sec.next.next;
        }

        return prim;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head = null;

        for (int x : arr)
            head = insert.insertNode(head, x);

        // Node mid = findMid(head);

    }
}
