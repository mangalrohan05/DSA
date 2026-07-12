public abstract class rev_in_grp {

    public static ListNode revK(ListNode head, int k) {

        if (k == 1 || head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroup = dummy;

        while (true) {

            ListNode kth = getNode(prevGroup, k);

            if (kth == null)
                break;
            // int arr[] = { 1, 2, 3, 4, 5 };
            ListNode nextGroup = kth.next;

            ListNode prev = nextGroup;
            ListNode curr = prevGroup.next;

            while (curr != nextGroup) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            ListNode temp = prevGroup.next;
            prevGroup.next = kth;
            prevGroup = temp;
        }

        return dummy.next;

    }

    public static ListNode getNode(ListNode node, int k) {
        while (node != null && k > 0) {
            node = node.next;
            k--;
        }

        return node;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        ListNode head = null;
        for (int x : arr)
            head = root.insert(head, x);

        head = revK(head, 2);
    }
}
