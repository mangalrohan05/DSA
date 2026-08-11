class Solution {
    public int totalFruit(int[] fruits) {
        int i = 0, maxLen = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < fruits.length; j++) {

            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            while (map.size() > 2) {
                int cnt = map.get(fruits[i])-1;
                
                if (cnt == 0)
                    map.remove(fruits[i]);
                else
                    map.put(fruits[i], cnt);
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);

        }

        return maxLen;
    }
}