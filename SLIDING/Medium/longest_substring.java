public class longest_substring {
    public static int findLongest(String s) {
        int idx[] = new int[128];
        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            left = Math.max(left, idx[curr]);
            idx[curr] = right + 1; 

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(findLongest(s));
    }
}