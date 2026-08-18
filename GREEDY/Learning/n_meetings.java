import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class n_meetings {

    public static ArrayList<Integer> maxMeetings(int s[], int f[]) {
        int n = s.length;

        ArrayList<Integer> res = new ArrayList<>();

        int[][] meetings = new int[n][3];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = s[i];
            meetings[i][1] = f[i];
            meetings[i][2] = i;
        }

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[1], b[1]));
        int en = -1;

        for (int[] m : meetings) {
            if (m[0] > en) {
                res.add(m[2] + 1);
                en = m[1];
            }
        }

        res.sort((a, b) -> Integer.compare(a, b));
        return res;
    }

    public static void main(String[] args) {
        int s[] = { 39, 50, 6, 15, 2 };
        int f[] = { 62, 73, 33, 43, 9 };

        System.out.println(maxMeetings(s, f));
    }
}
