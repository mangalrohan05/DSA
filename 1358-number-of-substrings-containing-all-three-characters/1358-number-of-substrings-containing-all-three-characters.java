class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int left = 0;
        long atMostCount = 0;

        int[] freq = new int[3];
        int distinct = 0;

        for (int right = 0; right < n; right++) {
            int curr = s.charAt(right) - 'a';

            if (freq[curr]++ == 0)
                distinct++;

            while (distinct > 2) {
                int leftChar = s.charAt(left++) - 'a';

                if (--freq[leftChar] == 0)
                    distinct--;
            }

            atMostCount += right - left + 1;
        }

        return (int)( (long) n*(n+1)/2 - atMostCount);
    }
}