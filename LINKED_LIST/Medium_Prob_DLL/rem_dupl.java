public class rem_dupl {
    public static Node removeDupli(Node head) {
        if (head == null || head.next == null)
            return head;

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if(curr.data == prev.data){
                prev.next = curr.next;

                if(curr.next != null)
                    curr.next.prev = prev;

                curr = curr.next;                
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 3, 3, 3, 4, 5 };
        Node head = null;
        for (int x : arr)
            head = root.insert(head, x);

        head = removeDupli(head);
    }
}
