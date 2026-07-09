public class LL_cycle_sec {

    public static boolean findLoop(Node head) {
        Node first = head;
        Node sec = head;

        while (sec != null && sec.next != null) {
            first = first.next;
            sec = sec.next.next;

            if (first == sec)
                
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(0);

        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        Node ls = head.next.next.next;
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = ls;

        System.out.println(findLoop(head));

    }
}
