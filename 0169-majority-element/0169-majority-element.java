class Solution {
    public int majorityElement(int[] nums) {
        int counter = 0, res = 0;

        for(int i = 0; i < nums.length; i++){
            if(counter == 0){
                res = nums[i];
                counter++;
            } else {
                if(nums[i] == res)
                    counter++;
                else
                    counter--;
            }
        }
        return res;
    }
}