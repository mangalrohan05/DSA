class palindrome {

    public static Node reverseNode(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;

            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public static boolean isPalin(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second = reverseNode(slow);
        Node copy = second;

        while (copy != null) {
            if (copy.data != head.data) {
                reverseNode(second);
                return false;
            }

            copy = copy.next;
            head = head.next;
        }

        reverseNode(second);
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1 };
        Node head = null;
        for (int x : arr) {
            head = insert.insertNode(head, x);
        }

        System.out.println(isPalin(head));
    }
}