public class rm_from_end {

    public static Node rmNode(Node head, int n) {

        if (head == null)
            return null;

        Node slow = head;
        Node fast = head;

        for (int i = 0; i < n; i++)
            fast = fast.next;

        if (fast == null)
            return head.next;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head = null;
        for (int x : arr)
            head = insert.insertNode(head, x);

        head = rmNode(head, 2);
    }
}