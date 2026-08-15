public class nice_subarray {

    public static int niceCount(int nums[], int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public static int atMost(int nums[], int k) {
        if (k < 0)
            return 0;
        
        int oddCounts = 0;
        int res = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 != 0)
                oddCounts++;

            while (oddCounts > k) {
                if (nums[left] % 2 != 0)
                    oddCounts--;
                left++;
            }

            res += right - left + 1;

        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 };
        int k = 2;
        System.out.println(niceCount(arr, k));
    }
}
