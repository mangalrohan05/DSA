public class max_cons {

    public static int findMax(int nums[], int k) {
        int maxLen = 0, i = 0, zeros = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0)
                zeros++;

            while (zeros > k) {
                if (nums[i] == 0)
                    zeros--;
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        int k = 3;

        System.out.println(findMax(nums, k));
    }
}