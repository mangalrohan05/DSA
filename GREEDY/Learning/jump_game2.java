public class jump_game2 {

    public static int jump(int nums[]) {
        int maxDist = 0;
        int curr = 0;
        int jumps = 0;

        for (int i = 0; i < nums.length; i++) {
            maxDist = Math.max(maxDist, i + nums[i]);

            if (i == curr) {
                jumps++;
                curr = maxDist;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 1, 4 };
        System.out.println(jump(arr));
    }
}
