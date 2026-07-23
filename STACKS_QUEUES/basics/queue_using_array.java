import java.util.Arrays;
import java.util.List;

class ArrayQueue {
    int arr[];
    int st, en;
    int currSize, maxSize;

    public ArrayQueue() {
        arr = new int[10];
        st = -1;
        en = -1;
        currSize = 0;
        maxSize = arr.length;
    }

    public void push(int x) {
        if (currSize == maxSize) {
            System.out.println("queue full");
            return;
        }
        if (en == -1) {
            st = 0;
            en = 0;
        } else {
            en = (en + 1) % maxSize;
        }

        arr[en] = x;
        currSize++;
    }

    public int pop() {
        if (st == -1) {
            System.out.println("Queue empty");
            System.exit(1);
            ;
        }

        int poped = arr[st];

        if (currSize == 1) {
            st = -1;
            en = -1;
        } else {
            st = (st + 1) % maxSize;
        }
        currSize--;
        return poped;
    }

    public int peek() {
        if (st == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[st];
    }

    public boolean isEmpty() {
        return (currSize == 0);
    }
}

public class queue_using_array {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();

        List<String> cmd = Arrays.asList("ArrayQueue", "push", "push", "peek", "pop", "isEmpty");
        List<List<Integer>> inp = Arrays.asList(Arrays.asList(), Arrays.asList(5), Arrays.asList(10), Arrays.asList(),
                Arrays.asList(), Arrays.asList());

        for (int i = 0; i < cmd.size(); i++) {
            switch (cmd.get(i)) {
                case "ArrayQueue":
                    System.out.println("null");
                    break;

                case "push":
                    q.push(inp.get(i).get(0));
                    System.out.println("null");

                    break;

                case "pop":
                    System.out.println(q.pop());
                    break;

                case "peek":
                    System.out.println(q.peek());
                    break;

                case "isEmpty":
                    System.out.println(q.isEmpty() ? "true" : "false");
                    break;

                default:
                    break;
            }
        }
    }
}