import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum {
    public static void count(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> ls = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1, k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ls.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1])
                        j++;

                    while (j < k && nums[k] == nums[k + 1])
                        k--;

                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        System.out.println(ls);
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        count(nums);
    }
}
