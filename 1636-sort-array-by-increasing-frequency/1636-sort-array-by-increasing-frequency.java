class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : nums)
            map.put(val, map.getOrDefault(val, 0) + 1);

        Integer temp[] = new Integer[nums.length];

        for(int i = 0; i < nums.length; i++)
            temp[i] = nums[i];

        Arrays.sort(temp, (a, b) -> {
            if(!map.get(a).equals(map.get(b)))
                return map.get(a) - map.get(b);
            return b-a;
        });

        for(int i = 0; i < nums.length; i++)
            nums[i] = temp[i];

        return nums;
    }
}