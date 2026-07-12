class Node {
    Node next;
    Node child;
    int data;

    Node(int data, Node next, Node child) {
        this.data = data;
        this.next = next;
        this.child = child;
    }

    Node(int data) {
        this(data, null, null);
    }

    Node(int data, Node child) {
        this(data, null, child);
    }
}

public class flatten {
    public static Node flattenList(Node head) {
        if (head == null || head.next == null && head.child == null)
            return head;

        Node dummy = head;
        Node parent = dummy;
        Node result = new Node(-1);

        while (parent != null) {
            result.next = parent;
            result = result.next;

            Node children = parent.child;

            while (children != null) {
                result.next = children;
                result = result.next;
                children = children.child;
            }
            parent = parent.next;
        }
        return sortList(dummy);
    }

    public static Node merge(Node left, Node right) {
        Node res = new Node(-1);
        Node curr = res;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }

            curr = curr.next;
        }

        if (left != null) {
            curr.next = left;
        }

        if(right != null){
            curr.next = right;
        }

        return res.next;
    }

    public static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node sortList(Node head) {
        if (head == null || head.next == null)
            return head;

        Node mid = getMid(head);
        Node right = mid.next;
        mid.next = null;

        Node left = sortList(head);
        right = sortList(right);

        return merge(left, right);

    }
}
