class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0, i = 0, zeros = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0)
                zeros++;

            while (zeros > k) {
                if (nums[i] == 0)
                    zeros--;
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}