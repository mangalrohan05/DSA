public class roman_to_integer {

    public static int romanToInt(String s) {
        int res = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = 0;

            switch (s.charAt(i)) {
                case 'I':
                    curr = 1;
                    break;
                case 'V':
                    curr = 5;
                    break;
                case 'X':
                    curr = 10;
                    break;
                case 'L':
                    curr = 50;
                    break;
                case 'C':
                    curr = 100;
                    break;
                case 'D':
                    curr = 500;
                    break;
                case 'M':
                    curr = 1000;
                    break;
            }

            if (curr < prev)
                res -= curr;
            else
                res += curr;

            prev = curr;
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
