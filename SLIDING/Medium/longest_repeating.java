public class longest_repeating {

    public static int longestStr(String s, int k) {
        int maxLen = 0;
        int maxFreq = 0;
        int left = 0;
        
        int freq[] = new int[26];

        for (int right = 0; right < s.length(); right++) {

            int idx = s.charAt(right) - 'A';
            freq[idx]++;

            maxFreq = Math.max(maxFreq, freq[idx]);

            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;

        System.out.println(longestStr(s, k));
    }
}
