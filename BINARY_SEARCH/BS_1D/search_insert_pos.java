public class search_insert_pos {
    public static int searchInsert(int[] nums, int target) {
        if (nums == null)
            return 0;

        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid;

        }

        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println(searchInsert(arr, target));
    }
}
