public class del_middle {
    public Node deleteMiddle(Node head) {

        if (head == null || head.next == null)
            return null;

        Node prim = head;
        Node sec = head.next.next;

        while (sec != null && sec.next != null) {
            prim = prim.next;
            sec = sec.next.next;
        }

        prim.next = prim.next.next;

        return head;
    }
}
