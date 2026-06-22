public class maxm_subarray {
    public static int max_sub(int nums[]) {
        int max = 0;
        int sum = 0;
        for (int val : nums) {
            sum += val;
            max = Math.max(sum, max);
            if (sum < 0)
                sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(max_sub(arr));
    }
}
