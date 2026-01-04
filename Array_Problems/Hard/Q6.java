import java.util.HashMap;

public class Q6 {

    public static void Brute(int arr[], int k, int n) {
        int res = 0;

        for (int i = 0; i < n-1; i++) {
            int curr = arr[i];
            if (curr == k) {
                res++;
            }
            for (int j = i + 1; j < n; j++) {
                curr ^= arr[j];

                if (curr == k)
                    res++;
            }
        }
        if(arr[n-1] == k){
            res++;
        }

        System.out.println(res);
    }

    public static void optimal(int arr[], int k, int n) {

        HashMap<Integer, Integer> check = new HashMap<>();
        check.put(0, 1);

        int curr = 0, res = 0;

        for (int val : arr) {
            curr ^= val;
            
            int target = curr ^ k;
            
            if (check.containsKey(target)) {
                res += check.get(target);
            }
            check.put(curr, check.getOrDefault(curr, 0) + 1);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 6, 4 };
        int k = 6, n = arr.length;

        // Brute(arr, k, n);
        optimal(arr, k, n);
    }
}
