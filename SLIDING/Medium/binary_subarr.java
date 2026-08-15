public class binary_subarr {

    public static int atMost(int[] nums, int goal) {
        if (goal < 0)
            return 0;

        int left = 0, sum = 0, count = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > goal) {
                sum -= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;

    }

    public static int findSub(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 0, 0, 0};
        int goal = 0;

        System.out.println(findSub(nums, goal));
    }
}
