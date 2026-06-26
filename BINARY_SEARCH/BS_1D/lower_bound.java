public class lower_bound {
    public static int search(int[] nums, int x) {
        if (nums == null)
            return 0;
        
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < x)
                left = mid + 1;
            else
                right = mid;

        }

        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 8, 15, 19 };
        int x = 9;
        System.out.println(search(arr, x));
    }
}
