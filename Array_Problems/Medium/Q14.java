import java.util.HashMap;

public class Q14 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        int k = 3;
        int n = arr.length;

        int count = 0, ps = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for(int i = 0; i < n; i++){
            ps += arr[i];
            int rem = ps - k;

            if(map.containsKey(rem)){
                count+=map.get(rem);
            }

            map.put(ps, map.getOrDefault(ps, 0)+1);
        }

        System.out.println(count);
    }
}
