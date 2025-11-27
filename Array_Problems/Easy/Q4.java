
public class Q4 {
    public static void main(String[] args) {
        // int arr[] = {1,1,2,2,2,3,3};
        int nums[] = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4 };

        if (nums == null || nums.length == 0)
            return;

        int i = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[i++] = nums[j];
            }
        }

        for(int val : nums) System.out.print(val+" ");
    }
}
