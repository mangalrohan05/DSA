import java.util.HashMap;

public class long_subarr_ksum_neg {
    public static void zero_sum(int arr[], int k) {
        int sum = 0;
        int max = 0;
        HashMap<Integer, Integer> prefix = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == k) {
                max = i+1;
            }
            if(prefix.containsKey(sum-k)){
                max = Math.max(max, i-prefix.get(sum-k));
            }
            if (!prefix.containsKey(sum))  {
                prefix.put(sum, i);
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = { 9, -3, 3, 0, 6, -5 };
        int k = 6;

        zero_sum(arr, k);
    }
}
