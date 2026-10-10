class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int val : nums)
            map.put(val, map.getOrDefault(val, 0) + 1);

        List<Integer> buck[] = new List[nums.length + 1];

        for(int key : map.keySet()){
            int freq = map.get(key);

            if(buck[freq] == null)
                buck[freq] = new ArrayList<>();
            
            buck[freq].add(key);
        }

        int res[] = new int[k];
        int idx = 0;

        for(int i = buck.length - 1; i >= 0; i--){
            if(buck[i] != null){
                for(int val : buck[i]){
                    res[idx++] = val;
                    if(idx == k) return res;
                }
            }
        }
        return res;
    }
}