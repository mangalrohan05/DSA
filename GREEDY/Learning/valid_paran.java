public class valid_paran {

    public static boolean isValid(String s) {

        if (s.length() == 0 || s.length() == 1 && s.charAt(0) == '*')
            return true;
        else if (s.length() == 1)
            return false;

        int diff = 0;

        for (char c : s.toCharArray()) {
            if (c == '(')
                diff++;
            else if (c == ')')
                diff--;
            if (c == '*' && diff > 0)
                diff--;
        }

        if(diff != 0)
            return false;

        return true;
    }

    public static void main(String[] args) {
        String s = "*)";
        System.out.println(isValid(s));
    }
}
