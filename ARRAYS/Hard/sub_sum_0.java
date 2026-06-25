import java.util.HashMap;

public class sub_sum_0 {
    public static void find_larg(int arr[]) {
        // int arr[] = { 6, -2, 2, -8, 1, 7, 4, -10 };
        int n = arr.length;
        int max = 0, sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                max = i + 1;
            }
            if (!map.containsKey(sum))
                map.put(sum, i);
            else {
                max = Math.max(max, i - map.get(sum));
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = { 6, -2, 2, -8, 1, 7, 4, -10 };
        find_larg(arr);
    }
}
