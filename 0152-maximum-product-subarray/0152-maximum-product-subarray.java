class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int res = Integer.MIN_VALUE;

        int l = 1, r = 1;

        for(int i = 0; i < n; i++){
            if(l == 0) l = 1;
            if(r == 0) r = 1;

            l *= nums[i];
            r *= nums[n - i - 1];

            res = Math.max(res, Math.max(l, r));
        }

        return res;
    }
}