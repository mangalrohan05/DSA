public class Q9 {
    public static boolean search(int[] nums, int target) {

        int st = 0, en = nums.length - 1;

        while (st <= en) {
            int mid = st + (en - st) / 2;

            if (nums[mid] == target)
                return true;

            // 🔥 Handle duplicates
            if (nums[st] == nums[mid] && nums[mid] == nums[en]) {
                st++;
                en--;
            }

            // Left half sorted
            else if (nums[st] <= nums[mid]) {
                if (nums[st] <= target && target < nums[mid]) {
                    en = mid - 1;
                } else {
                    st = mid + 1;
                }
            }

            // Right half sorted
            else {
                if (nums[mid] < target && target <= nums[en]) {
                    st = mid + 1;
                } else {
                    en = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 5;

        boolean res = search(nums, target);
        System.out.println(res);
    }
}
