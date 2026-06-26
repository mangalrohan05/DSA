public class first_last_pos {
    public static int[] searchRange(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return new int[] { -1, -1 };
        }

        int first = -1, last = -1;

        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                last = mid;
                left = mid + 1;
            }
        }
        if (last == -1)
            return new int[] { -1, -1 };

        left = 0;
        right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                first = mid;
                right = mid;
            }
        }

        return new int[] { first, last };
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] res = searchRange(arr, target);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
