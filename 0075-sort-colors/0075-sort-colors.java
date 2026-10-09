class Solution {
    public void sortColors(int[] nums) {
        int l = 0, m = 0, r = nums.length - 1;

        while(m <= r){
            if(nums[m] == 2)
                swap(m, r--, nums);
            else if(nums[m] == 0)
                swap(l++, m++, nums);
            else 
                m++;
        }
    }

    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}