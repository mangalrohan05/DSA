public class rearrange_by_sign {
    public static void arrange(int nums[]) {
        int res[] = new int[nums.length];
        int pos = 0, neg = 1;
        for (int val : nums) {
            if(val > 0){
                res[pos] = val;
                pos += 2;
            } else {
                res[neg] = val;
                neg += 2;
            }
        }

        for (int val : res) {
            System.out.print(val + " ");
        }

    }

    public static void main(String[] args) {
        int nums[] = { 3, 1, -2, -5, 2, -4 };
        arrange(nums);
    }
}
