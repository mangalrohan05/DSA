import java.util.Arrays;
import java.util.List;

class Node {
    Node next;
    int val;

    Node(int x) {
        next = null;
        val = x;
    }
}

class Myqueue {
    Node head;
    Node en;
    int currSize;

    Myqueue() {
        head = null;
        en = null;
        currSize = 0;
    }

    public void push(int x) {
        Node el = new Node(x);

        if (head == null)
            head = en = el;

        else {
            en.next = el;
            en = en.next;
        }
        currSize++;
    }

    public int pop() {
        if (currSize == 0)
            return -1;

        int val = head.val;
        Node curr = head;
        head = head.next;
        curr = null;
        currSize--;

        return val;
    }

    public int peek() {
        if (currSize == 0)
            return -1;
        return head.val;
    }

    public boolean isEmpty() {
        return currSize == 0;
    }
}

public class queue_using_ll {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("LinkedListQueue", "push", "push",
                "peek", "pop", "isEmpty");
        int[][] inp = { {}, { 3 }, { 7 }, {}, {}, {} };
    }
}
