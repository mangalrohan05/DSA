public class floor_ciel {
    public static void searchFC(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return;

        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid;

        }

        Integer floor = (left == 0) ? null : nums[left - 1];
        Integer ceil = (left == nums.length) ? null : nums[left];

        if (ceil != null && ceil == target)
            floor = target;

        System.out.println("Floor: " + floor);
        System.out.println("Ceil : " + ceil);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 7, 8, 10 };
        int target = 6;
        searchFC(arr, target);
    }
}
