class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> list = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];

            if (list.containsKey(comp)) {
                return new int[] { list.get(comp), i };
            }

            list.put(nums[i], i);
        }
        return new int[] {};
    }
}