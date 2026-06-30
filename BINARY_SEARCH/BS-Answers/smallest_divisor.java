public class smallest_divisor {
    public static boolean canDiv(int arr[], int threshold, int k) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] + k - 1) / k;

            if (sum > threshold)
                return false;
        }

        return true;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = 0;
        for (int val : nums)
            right = Math.max(val, right);

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canDiv(nums, threshold, mid)) {
                right = mid;
            } else {
                left = mid+1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 44, 22, 33, 11, 1 };
        int threshold = 5;

        System.out.println(smallestDivisor(arr, threshold));
    }
}