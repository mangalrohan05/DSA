public class Q6 {
    public static int[] pos(int nums[], int target) {
        int res[] = {-1, -1};

        int st = 0, en = nums.length - 1;

        while (st <= en) {
            int mid = (st + en) / 2;

            if (nums[mid] < target) {
                st = mid + 1;
            } else if (nums[mid] > target) {
                en = mid - 1;
            } else {
                en = mid - 1;
                res[0] = mid;
            }
        }
        st = 0;
        en = nums.length-1;

        while (st <= en) {
            int mid = (st + en) / 2;

            if (nums[mid] < target) {
                st = mid + 1;
            } else if (nums[mid] > target) {
                en = mid - 1;
            } else {
                st = mid + 1;
                res[1] = mid;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;

        int res[] = pos(nums, target);
        for (int val : res) {
            System.out.println(val);
        }
    }
}
