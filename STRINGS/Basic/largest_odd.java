public class largest_odd {
    public static String largestOddNumber(String num) {
        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            if ((int) num.charAt(i) % 2 != 0) {
                return num.substring(0, i+1);
            }
        }

        return "";
    }

    public void main(String[] args) {
        String s = "35427";
        System.out.println(largestOddNumber(s));
    }

}
