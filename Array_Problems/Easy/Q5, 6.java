class Q5 {
    public static void rotate(int[] nums, int k) {
        if (nums == null) return;
        int n = nums.length;
        if (n <= 1) return;

        k = k % n;           
        if (k == 0) return;  

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] a, int i, int j) {
        while (i < j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int nums[] = { -1, -100, 3, 99 };
        int k = 2;

        rotate(nums, k);

        for (int v : nums) System.out.print(v + " ");
    }
}
