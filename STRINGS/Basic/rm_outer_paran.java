public class rm_outer_paran {
    public static void main(String[] args) {
        String st = "(()())(())(()(()))";
        int depth = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < st.length(); i++) {

            if (st.charAt(i) == '(') {
                if (depth > 0)
                    sb.append('(');
                depth++;
            } else {
                if (depth > 1)
                    sb.append(')');
                depth--;
            }
        }
        System.out.println(sb);

    }
}