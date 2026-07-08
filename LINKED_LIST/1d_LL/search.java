class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this(data, null);
    }
}

public class search {

    public static boolean searchVal(Node node, int val) {

        while (node != null) {
            if (node.data == val)
                return true;
            node = node.next;
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6 };
        Node head = null;
        for (int x : arr)
            head = insert_at_head.insert(head, x);

        System.out.println(searchVal(head, 5));
        System.out.println(searchVal(head, 0));
    }
}