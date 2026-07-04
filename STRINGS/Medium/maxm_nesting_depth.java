public class maxm_nesting_depth {

    public static int maxDepth(String s) {
        int depth = 0;
        int maxm = 0;

        for(char ch : s.toCharArray()){
            if(ch == '(')
                depth++;
            if(ch == ')')
                depth--;

            maxm = Math.max(maxm, depth);
        }

        return maxm;
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
}
