import java.util.*;

public class Q14 {

    public static void main(String[] args) {
        int arr[] = { -1, 1, 1 };
        int k = 1;

        int n = arr.length;

        Map<Integer, Integer> mp = new HashMap<>();

        int sum = 0, highest = 0;

        for (int i = 0; i < n; i++) {
            sum+=arr[i];

            if(sum == k) highest = i+1;

            int prev = sum-k;

            if(mp.containsKey(prev)) {
                int len = i - mp.get(prev);
                highest = Math.max(highest, len);
            }

            if(!mp.containsKey(sum)){
                mp.put(sum, i);
            }
        }

        System.out.println(highest);
    }
}
