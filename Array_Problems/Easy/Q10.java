import java.util.HashMap;

public class Q10 {
    public static void main(String[] args) {
        int arr[] = { 3, 0, 1 };
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], 1);
        }

        for (int i = 0; i <= n; i++) {
            if (!map.containsKey(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
