public class Q {

    public static int countPartitions(int nums[], int maxSum) {
        int part = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxSum) {
                part++;
                sum = 0;
                i--;
            }
        }
        return part+1;
    }

    public static int min(int nums[], int k) {

        int st = 0;

        int maxSum = 0;

        for (int val : nums) {
            st = Math.max(st, val);
            maxSum += val;
        }

        while (st <= maxSum) {
            int mid = (st + maxSum) / 2;

            int part = countPartitions(nums, mid);
            if (part <= k) {
                maxSum = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return st;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        int k = 2;
        int res = min(nums, k);
        System.out.println(res);
    }
}
