public class count_occurences {
    public static int searchOcc(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return 0;
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
            return 0;

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

        return (last - first + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 3, 3, 3, 4 };
        int target = 3;
        System.out.println(searchOcc(arr, target));
    }
}
