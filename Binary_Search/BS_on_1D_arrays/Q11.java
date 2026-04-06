public class Q11 {

    public static int findMin(int[] nums) {

        int st = 0, en = nums.length - 1;

        while (st < en) {
            int mid = st + (en - st) / 2;

            if (nums[mid] > nums[en]) {
                st = mid + 1;
            } else {
                en = mid;
            }
        }
        if (st==0) return nums.length;

        return st;
    }

    public static void main(String[] args) {
        int[] nums = {
                1, 2, 3, 4, 5
        };

        int res = findMin(nums);
        System.out.println(res);
    }
}
