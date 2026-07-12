public class rotate_LL {
    public static ListNode rotate(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null)
            return head;

        int len = 1;
        ListNode tail = head;

        while (tail.next != null) {
            len++;
            tail = tail.next;
        }

        k %= len;

        if (k == 0)
            return head;

        ListNode temp = head;

        for (int i = 1; i < len - k; i++)
            temp = temp.next;

        ListNode right = temp.next;
        ListNode res = right;

        temp.next = null;
        tail.next = head;

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        ListNode head = null;
        for (int x : arr)
            head = root.insert(head, x);

        head = rotate(head, 2);
    }
}
