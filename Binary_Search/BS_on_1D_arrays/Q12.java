public class Q12 {

    public static int single(int[] nums, int n){
        int st = 0, en = n - 1;

        while (st < en) {
            int mid = (st + en) / 2;

            // Make mid even
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                st = mid + 2;
            } else {
                en = mid;
            }
        }

        return nums[st];
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2,3,3,4,4,8,8};
        int n = nums.length;

        int res = single(nums, n);
        System.out.println(res);
    }
}