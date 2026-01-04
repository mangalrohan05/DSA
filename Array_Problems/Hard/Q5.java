import java.util.HashMap;

public class Q5 {

    public static void optimal(int[] arr, int n) {
        int sum = 0;
        int result = 0;
        HashMap<Integer, Integer> check = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                result = Math.max(result, i + 1);
            } else {
                if (check.containsKey(sum)) {
                    result = Math.max(result, i - check.get(sum));
                } else {
                    check.put(sum, i);
                }
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        int arr[] = { 6, -2, 2, -8, 1, 7, 4, -10 };
        int n = arr.length;

        optimal(arr, n);
    }
}
