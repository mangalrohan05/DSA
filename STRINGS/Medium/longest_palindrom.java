public class longest_palindrom {
    static int st = 0, max = 1;

    public static void expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            int len = right - left + 1;

            if (len > max) {
                max = len;
                st = left;
            }

            left--;
            right++;
        }
    }

    public static String longestPalindrome(String s) {

        if (s.length() <= 1)
            return s;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            expand(s, i, i);
            expand(s, i, i + 1);
        }

        return s.substring(st, st + max);
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
