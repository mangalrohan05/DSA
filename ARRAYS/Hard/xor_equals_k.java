import java.util.HashMap;

public class xor_equals_k {
    public static void find_xor(int arr[], int k) {
        int n = arr.length;
        int xor = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            xor ^= arr[i];

            int target = xor ^ k;

            if (map.containsKey(target))
                count += map.get(target);
            
            map.put(target, map.getOrDefault(xor, 0) + 1);

        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9 };
        int k = 5;

        find_xor(arr, k);
    }
}
