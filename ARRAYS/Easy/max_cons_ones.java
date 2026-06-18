public class max_cons_ones {
    public static void cons_ones(int nums[]) {
        int count = 0, larg = -1;
        for (int val : nums) {
            if (val == 1)
                count++;
            else
                count = 0;

            larg = Math.max(count, larg);
        }
        System.out.println(larg);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        cons_ones(nums);
    }
}
