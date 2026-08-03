import java.util.Stack;

public class rm_k_dig {

    public static String findRemoved(String str, int k) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            while (!st.isEmpty() && st.peek() > curr && k > 0) {
                st.pop();
                k--;
            }

            st.push(curr);
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        if (st.isEmpty())
            return "0";

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty())
            sb.append(st.pop());

        sb = sb.reverse();

        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0')
            i++;

        if (i == sb.length())
            return "0";

        return sb.substring(i);
    }

    public static void main(String[] args) {
        String str = "10200";
        int k = 1;
        // System.out.println(findRemoved(str, k));
        System.out.println(4^5^6);
    }
}