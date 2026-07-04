public class string_to_integer {
    public static int myAtoi(String s) {
        long res = 0;

        int i = 0, n = s.length();
        int sign = 1;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n)
            return 0;

        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-')
                sign = -1;
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            res = res*10 + (s.charAt(i) - '0');

            if(sign == 1 && res > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if(sign == -1 && -res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (res*sign);
    }

    public static void main(String[] args) {
        String s = "1337c0d3";
        System.out.println(myAtoi(s));
    }

}
