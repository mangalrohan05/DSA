public class next_permutation {
    public static void nextPerm(int nums[]) {
        int n = nums.length;
        int breakPoint = -1, right = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakPoint = i;
                break;
            }
        }

        if (breakPoint < 0) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > breakPoint; i--) {
            if (nums[i] > nums[breakPoint]) {
                right = i;
                break;
            }
        }

        swap(nums, breakPoint, right);

        reverse(nums, breakPoint + 1, n - 1);

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1 };
        nextPerm(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
