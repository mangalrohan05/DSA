import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge_interval {
    public static void find_intervals(int intervals[][]) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ls = new ArrayList<>();

        int[] curr = intervals[0];
        ls.add(curr);

        for (int[] next : intervals) {
            int currEnd = curr[1];
            int nextStart = next[0];
            int nextEnd = next[1];

            if (currEnd >= nextStart) {
                curr[1] = Math.max(currEnd, nextEnd);
            } else {
                curr = next;
                ls.add(curr);
            }
        }

        for(int arr[] : ls){
            for(int val: arr){
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        // int arr[][] = { { 4, 7 }, { 1, 4 } };
        find_intervals(arr);
    }
}
