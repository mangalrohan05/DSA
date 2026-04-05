public class Q10 {

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
        System.out.println(st);
        return nums[st];
    }

    public static void main(String[] args) {
        int[] nums = {
                11,13,15,17
        };

        int min = findMin(nums);
        System.out.println(min);
    }
}
