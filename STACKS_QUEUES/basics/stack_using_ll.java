import java.util.Arrays;
import java.util.List;

class Node {
    Node next;
    int val;

    Node(int d) {
        val = d;
        next = null;
    }
}

class Mystack {
    Node head;
    int size;

    Mystack() {
        head = null;
        size = 0;
    }

    public void push(int x) {
        Node el = new Node(x);
        el.next = head;
        head = el;
        size++;
    }

    public int pop() {
        if (head == null)
            return -1;

        int poped = head.val;
        Node curr = head;
        head = head.next;
        curr = null;
        size--;
        return poped;
    }

    public int top() {
        if (head == null)
            return -1;

        return head.val;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}

public class stack_using_ll {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("LinkedListStack", "push", "push", "pop", "top", "isEmpty");
        int[][] inp = { {}, { 3 }, { 7 }, {}, {}, {} };
    }
}
