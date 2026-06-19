import java.util.ArrayList;
import java.util.HashMap;

public class two_sum {
    public static void check_sum(int nums[], int target) {
        HashMap<Integer, Integer> list = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];

            if (list.containsKey(comp)) {
                res.add(list.get(comp));
                res.add(i);
                break;
            }

            list.put(nums[i], i);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int t = 9;

        check_sum(arr, t);
    }
}
