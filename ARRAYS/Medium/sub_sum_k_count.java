import java.util.HashMap;

public class sub_sum_k_count {
    public static void count_sub(int nums[], int k) {
        HashMap<Integer, Integer> prefix = new HashMap<>();
        prefix.put(0, 1);

        int sum = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int counter = sum - k;

            if (prefix.containsKey(counter)) {
                count += prefix.get(counter);
            }

            prefix.put(sum, prefix.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int k = 3;
        count_sub(arr, k);
    }
}
