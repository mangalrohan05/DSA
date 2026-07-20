import java.util.HashMap;

class Node {
    int data;
    Node next;
    Node random;

    Node() {
        this.data = 0;
        this.next = null;
        this.random = null;
    }

    Node(int x) {
        this.data = x;
        this.next = null;
        this.random = null;
    }

    Node(int x, Node nextNode, Node randomNode) {
        this.data = x;
        this.next = nextNode;
        this.random = randomNode;
    }
}

public class random {
    public Node copyRandomList(Node head) {

        if (head == null)
            return null;
        
        HashMap<Node, Node> map = new HashMap<>();
        Node temp = head;

        while (temp != null) {
            Node newNode = new Node(temp.data);
            map.put(temp, newNode);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {

            Node copied = map.get(temp);

            copied.next = map.get(temp.next);
            copied.random = map.get(temp.random);

            temp = temp.next;
        }

        return map.get(head);
    }
}