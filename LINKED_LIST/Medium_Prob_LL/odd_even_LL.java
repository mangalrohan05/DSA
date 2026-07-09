public class odd_even_LL {

    public static Node oddEven(Node head) {

        if (head == null || head.next == null)
            return head;

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even !=null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        Node head = null;

        for (int x : arr)
            head = insert.insertNode(head, x);

        Node resu = oddEven(head);
    }
}
