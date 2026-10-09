class Solution {
    public void nextPermutation(int[] nums) {
        int b = -1;
        int n = nums.length;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                b = i - 1;
                break;
            }
        }

        if (b == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > b; i--) {
            if (nums[i] > nums[b]) {
                int temp = nums[b];
                nums[b] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        reverse(nums, b + 1, n - 1);
    }

    public void reverse(int[] nums, int st, int en) {
        while (st < en) {
            int temp = nums[st];
            nums[st] = nums[en];
            nums[en] = temp;

            st++;
            en--;
        }
    }
}