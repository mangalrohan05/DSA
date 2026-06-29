public class single_rotated {
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        int left = 0, right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid % 2 == 1)
                mid--;

            if (nums[mid] == nums[mid + 1])
                left = mid + 2;
            else
                right = mid;
        }

        return nums[left];

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(arr));
    }
}
