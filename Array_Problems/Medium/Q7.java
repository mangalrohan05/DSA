public class Q7 {
    public static void main(String[] args) {

        int nums[] = { 5, 5, 3, 2, -1, -2, -3, -4 };
        int n = nums.length;

        int a[] = new int[n / 2];
        int b[] = new int[n / 2];

        int i = 0, j = 0;

        for (int val : nums) {
            if (val >= 0)
                a[i++] = val;
            else
                b[j++] = val;
        }

        int x = 0;

        for (int k = 0; k < n; k += 2) {
            nums[k] = a[x];
            nums[k + 1] = b[x];
            x++;
        }

        // Print result
        for (int val : nums)
            System.out.print(val + " ");
    }
}
