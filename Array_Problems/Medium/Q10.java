import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 1, 3, 2 };
        int n = arr.length;

        if (n == 0) {
            System.out.println(0);
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        for(int val : arr){
            set.add(val);
        }

        int longest = 0;

        for(int val : set){
            if(!set.contains(val-1)){
                int curr = val;
                int count = 1;

                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }

        System.out.println(longest);
    }
}
