import java.util.Arrays;

class Solution {
    public static int findContentChildren(int[] g, int[] s) {
        int i = 0, j = 0;
        int count = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int g[] = { 10, 9, 8, 7 }, s[] = { 5, 6, 7, 8 };
        System.out.println(findContentChildren(g, s));
    }
}