public class peak {
    public static int findPeakElement(int[] nums) {
        int n = nums.length;

        int left = 0, right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 1, 3, 5, 6, 4 };
        int arr[] = { 1, 3, 2, 5, 4, 7, 6, 9, 8, 10, 3, 2, 1 };
        System.out.println(findPeakElement(arr));
    }
}
