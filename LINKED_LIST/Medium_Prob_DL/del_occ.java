public class del_occ {

    public static Node deleteOcc(Node head, int key) {
        Node res = new Node(-1);
        Node tail = res;

        while (head != null) {
            if (head.data != key) {
                res.next = head;
                res = res.next;
            }
            head = head.next;
        }
        res.next = null;

        return tail.next;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4 };
        Node head = null;
        for (int x : arr)
            head = root.insert(head, x);

        head = deleteOcc(head, 1);

    }
}
