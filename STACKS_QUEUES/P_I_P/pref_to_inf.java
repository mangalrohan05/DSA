import java.util.Stack;

public class pref_to_inf {

    public static void PrefixToInfix(String s) {
        Stack<String> st = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c))
                st.push(String.valueOf(c));
            else {
                String op1 = st.pop();
                String op2 = st.pop();

                String temp = "(" + op1 + c + op2 + ")";
                st.push(temp);
            }
        }
        System.out.println(st.pop());
    }

    public static void main(String[] args) {
        String s = "+ab";
        PrefixToInfix(s);
    }
}
