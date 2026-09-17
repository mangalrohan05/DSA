class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length == 1) return nums[0];

        int res[] = new int[nums.length / 2];
        boolean min = true;

        int x = 0;

        for(int i = 0; i < nums.length-1; i+=2){
            if(min)
                res[x++] = Math.min(nums[i], nums[i+1]); 
            else
                res[x++] = Math.max(nums[i], nums[i+1]); 
            min = !min;
        }

        return minMaxGame(res);
    }
}