import java.util.Stack;

public class inf_to_post {

    public static int prec(char c) {
        if (c == '^')
            return 3;
        if (c == '/' || c == '*')
            return 2;

        if (c == '+' || c == '-')
            return 1;

        return -1;
    }

    public static void infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        s = s.replaceAll("\\s+", "");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c))
                res.append(c);
            else if (c == '(')
                stack.push(c);
            else if (c == ')') {
                while (stack.peek() != '(') {
                    res.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && stack.peek() != '(' && (prec(c) < prec(stack.peek()) ||
                                (prec(c) == prec(stack.peek()) && c != '^')))
                    res.append(stack.pop());
            }
        }

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        System.out.println("Postfix : " + res.toString());

    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d - e) ^ (f + g * h) - i";
        infixToPostfix(exp);
    }
}