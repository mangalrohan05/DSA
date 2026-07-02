public class split_array_largest_sum {
        public static boolean canForm(int nums[], int m, int limit) {
        int arrSum = 0, splits = 1;

        for (int pages : nums) {
            if (arrSum + pages > limit) {
                arrSum = pages;
                splits++;
            } else {
                arrSum += pages;
            }

            if (splits > m) {
                return false;
            }
        }

        return true;
    }

    public static int splitArray(int nums[], int m) {
        int left = 0, right = 0;

        for (int val : nums) {
            left = left >= val ? left : val;
            right += val;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canForm(nums, m, mid))
                right = mid;
            else
                left = mid + 1;
        }

        return left;

    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int k = 2;

        System.out.println(splitArray(nums, k));
    }
}
