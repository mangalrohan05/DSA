public class find_min_rotated {
    public static int find_min(int nums[]) {

        int n = nums.length;

        int left = 0, right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[left] < nums[right]) {
                return nums[left];
                // left sorted
            } else {
                if (nums[mid] > nums[right]) {
                    left = mid+1;
                } else
                    // right sorted
                    right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        // int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int arr[] = { 7, 0, 1, 2, 3, 4, 5, 6 };
        System.out.println(find_min(arr));
    }
}
