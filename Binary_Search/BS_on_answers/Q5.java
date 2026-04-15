public class Q5 {

    public static int smallest(int nums[], int threshold) {

        int st = 1, max = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }

        while (st <= max) {
            int mid = (st + max) / 2;
            int sum = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                sum += (int) (Math.ceil(nums[i] / (float) mid));
            }
            if (sum <= threshold) {
                max = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return st;
    }

    public static void main(String[] args) {
        int nums[] = { 44, 22, 33, 11, 1 };
        int threshold = 5;

        int res = smallest(nums, threshold);
        System.out.println(res);
    }
}
