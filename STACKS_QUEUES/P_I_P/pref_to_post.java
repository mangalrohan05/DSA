import java.util.Stack;

public class pref_to_post {

    public static void PrefixToPostfix(String s) {
        Stack<String> st = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c))
                st.push(String.valueOf(c));
            else{
                String a = st.pop();
                String b = st.pop();

                String temp = a+b+c;
                st.push(temp);
            }
        }
        System.out.println(st.pop());

    }

    public static void main(String[] args) {
        String s = "*+ab-cd";
        PrefixToPostfix(s);
    }
}
