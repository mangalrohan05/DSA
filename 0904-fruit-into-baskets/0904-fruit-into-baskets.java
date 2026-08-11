class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int i = 0, maxLen = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < n; j++) {
            int curr = fruits[j];

            map.put(curr, map.getOrDefault(curr, 0) + 1);

            while (map.size() > 2 && i < n) {
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if (map.get(fruits[i]) == 0)
                    map.remove(fruits[i]);
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);

        }

        return maxLen;
    }
}