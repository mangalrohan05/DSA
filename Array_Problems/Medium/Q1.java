import java.util.HashMap;

public class Q1 {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15}, target = 9;
        int n = arr.length;

        HashMap<Integer, Integer> res = new HashMap<>();

        for(int i = 0; i < n; i++){
            int x = target - arr[i];

            if(res.containsKey(x)){
                System.out.println(arr[i] + " " + res.get(x));
                break;
            }

            res.put(arr[i], i);
        }

    }
}