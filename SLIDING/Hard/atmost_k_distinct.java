import java.util.HashMap;

public class atmost_k_distinct {

    public static int atMost(int nums[], int k) {
        if (k <= 0)
            return 0;

        int n = nums.length;

        int left = 0;
        long atMostCount = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int distinct = 0;

        for (int right = 0; right < n; right++) {
            int curr = nums[right];
            map.put(curr, map.getOrDefault(curr, 0) + 1);

            if (map.get(curr) == 1)
                distinct++;

            while (distinct > k) {
                int leftVal = nums[left];

                if (map.get(leftVal) == 1) {
                    map.remove(leftVal);
                    distinct--;
                } else {
                    map.put(leftVal, map.get(leftVal) - 1);
                }

                left++;
            }

            atMostCount += right - left + 1;
        }

        return (int) atMostCount;

    }

    public static int countDiffs(int nums[], int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 1, 3, 4 };
        int k = 3;
        System.out.println(countDiffs(nums, k));
    }
}
