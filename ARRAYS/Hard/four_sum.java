import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class four_sum {
    public static void count(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> ls = new ArrayList<>();

        for (int a = 0; a < n; a++) {
            if (a > 0 && nums[a] == nums[a - 1])
                continue;
            for (int i = a+1; i < n; i++) {
                if (i > a+1 && nums[i] == nums[i - 1])
                    continue;

                int j = i + 1, k = n - 1;

                while (j < k) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[a];
                    if (sum == target) {
                        ls.add(Arrays.asList(nums[a], nums[i], nums[j], nums[k]));
                        j++;
                        k--;

                        while (j < k && nums[j] == nums[j - 1])
                            j++;

                        while (j < k && nums[k] == nums[k + 1])
                            k--;

                    } else if (sum < target) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
        System.out.println(ls);
    }

    public static void main(String[] args) {
        int nums[] = { 1,0,-1,0,-2,2 };
        int target = 0;
        count(nums, target);
    }
}
