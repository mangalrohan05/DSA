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

public class valid_param {

    public static boolean isValid(String s) {

        ArrayStack stack = new ArrayStack();

        HashMap<Character, Character> mp = new HashMap<>();
        mp.put('(', ')');
        mp.put('{', '}');
        mp.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }

            if (stack.top() == mp.get(s.charAt(i))) {
                stack.pop();
            } 
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "([)]";
    }
}