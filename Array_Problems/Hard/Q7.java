import java.util.*;

public class Q7 {
    public static void main(String[] args) {

        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int st = intervals[0][0];
        int en = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= en) {
                en = Math.max(en, intervals[i][1]);
            } else {
                result.add(new int[]{st, en});
                st = intervals[i][0];
                en = intervals[i][1];
            }
        }

        result.add(new int[]{st, en});

        for (int[] it : result) {
            System.out.println(Arrays.toString(it));
        }
    }
}
