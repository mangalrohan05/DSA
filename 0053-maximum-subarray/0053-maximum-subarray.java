class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int max = nums[0], curr = 0;

        for (int x: nums) {
            curr += x;
            max = Math.max(curr, max);
            if (curr < 0)
                curr = 0;
        }
        return max;
    }
}