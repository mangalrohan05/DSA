public class move_zeroes {
    public static void move(int nums[]) {
        int n = nums.length;

        int i = 0, j = 0;
        while (i < n) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
            i++;
        }
        while (j < n) {
            nums[j++] = 0;
        }

        for(int val : nums){
            System.out.print(val+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };
        move(arr);
    }
}
