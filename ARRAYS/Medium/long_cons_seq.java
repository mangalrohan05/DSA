import java.util.HashSet;
import java.util.Set;

public class long_cons_seq {
    public static void long_cons(int arr[]) {
        int n = arr.length;
        if (n == 0) return;

        int longest = 1;
        Set<Integer> nums = new HashSet<>();

        for(int val : arr) nums.add(val);

        for(int val : arr){
            if(! nums.contains(val-1)){
                int curr = 1;
                int x = val;

                while (nums.contains(x)) {
                    x++;
                    curr++;
                }
                longest = Math.max(curr, longest);
            }
        }
        System.out.println(longest);
    }

    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 1, 3, 2 };
        long_cons(arr);
    }
}