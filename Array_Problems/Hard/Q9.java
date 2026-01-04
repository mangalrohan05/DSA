import java.util.HashMap;

public class Q9 {

    public static void Brute(int arr[], int n) {
        int total = (n) * (n + 1) / 2, sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : arr) {
            sum += val;
            map.put(val, map.getOrDefault(val, 0) + 1);

            if (map.get(val) == 2) {
                System.out.println(val);
                sum -= val;
            }
        }

        System.out.println(total - sum);
    }

    public static void Optimal(int arr[], int n) {
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
            xor ^= (i + 1);
        }

        int rmsb = 0;

        while (true) {
            if ((xor & (1 << rmsb)) != 0)
                break;
            else
                rmsb++;
        }

        rmsb = 1 << rmsb;

        int x = 0, y = 0;

        for (int val : arr) {
            if ((val & rmsb) != 0)
                x ^= val;
            else
                y ^= val;
        }

        for (int i = 1; i <= n; i++) {
            if ((i & rmsb) != 0)
                x ^= i;
            else
                y ^= i;
        }

        for (int val : arr) {
            if (val == x) {
                System.out.println("Repeating: " + x);
                System.out.println("Missing: " + y);
                return;
            }
        }

        System.out.println("Repeating: " + y);
        System.out.println("Missing: " + x);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6, 7, 5, 7 };
        Brute(arr, arr.length);
        Optimal(arr, arr.length);
    }
}
