import java.util.*;

class ArrayStack {
    int stackArray[];
    int capacity;
    int topIndex;

    ArrayStack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        topIndex = -1;
    }

    ArrayStack() {
        this(100);
    }

    public void push(int x) {
        if (topIndex >= capacity - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stackArray[++topIndex] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        return stackArray[topIndex--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        return stackArray[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

}

public class stack_using_array {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();

        List<String> cmd = Arrays.asList("ArrayStack", "push", "push", "pop", "top", "isEmpty");
        List<List<Integer>> inputs = Arrays.asList(Arrays.asList(), Arrays.asList(5), Arrays.asList(10), Arrays.asList(), Arrays.asList(), Arrays.asList());

        for(int i = 0; i < cmd.size(); i++){
            switch (cmd.get(i)) {
                case "push":
                    stack.push(inputs.get(i).get(0));
                    break;

                case "pop":
                    System.out.println(stack.pop());
                    break;

                case "top":
                    System.out.println(stack.top());
                    break;

                case "isEmpty":
                    System.out.println(stack.isEmpty() ? "true" : "false");
                    break;

                case "ArrayStack":
                    System.out.println("null");
                    break;
            
                default:
                    break;
            }
        }
    }
}