import java.util.HashMap;

public class Q9 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5}, b[] = {2, 3, 4, 4, 5};
        int n = 5, m = 5;

        HashMap<Integer, Integer> m1 = new HashMap<>();
        HashMap<Integer, Integer> m2 = new HashMap<>();

        // Union
        for (int i = 0; i < n; i++) {
            m1.put(a[i], m1.getOrDefault(a[i], 0) + 1);
        }

        for (int i = 0; i < m; i++) {
            m2.put(b[i], m2.getOrDefault(b[i], 0) + 1);
        }

        
        for (int key : m2.keySet()) {
            m1.put(key, m1.getOrDefault(key, 0) + 1);
        }
        System.out.println("Union is: " + m1.keySet());
    }
}
