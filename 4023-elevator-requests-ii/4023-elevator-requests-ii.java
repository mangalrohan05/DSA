import java.util.*;

class Solution {
    public long elevatorRequests(int n, int start, int[] requests) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int r : requests) {
            if (r < start) left.add(start - r);
            else if (r > start) right.add(r - start);
        }
        Collections.sort(left);
        Collections.sort(right);

        int p = left.size(), q = right.size(), m = p + q;
        if (m == 0) return 0;

        long[] L = new long[p + 1];
        for (int i = 1; i <= p; i++) L[i] = left.get(i - 1);
        long[] R = new long[q + 1];
        for (int j = 1; j <= q; j++) R[j] = right.get(j - 1);

        final long INF = Long.MAX_VALUE / 2;
        long[][] dpL = new long[p + 1][q + 1];
        long[][] dpR = new long[p + 1][q + 1];
        for (long[] row : dpL) Arrays.fill(row, INF);
        for (long[] row : dpR) Arrays.fill(row, INF);

        for (int k = 1; k <= m; k++) {
            long w = m - k + 1;
            for (int i = Math.max(0, k - q); i <= Math.min(p, k); i++) {
                int j = k - i;

                if (i >= 1) {
                    long best = INF;
                    if (i == 1 && j == 0) best = L[1] * w;
                    if (i >= 2) best = Math.min(best, dpL[i - 1][j] + (L[i] - L[i - 1]) * w);
                    if (j >= 1) best = Math.min(best, dpR[i - 1][j] + (L[i] + R[j]) * w);
                    dpL[i][j] = best;
                }
                if (j >= 1) {
                    long best = INF;
                    if (j == 1 && i == 0) best = R[1] * w;
                    if (j >= 2) best = Math.min(best, dpR[i][j - 1] + (R[j] - R[j - 1]) * w);
                    if (i >= 1) best = Math.min(best, dpL[i][j - 1] + (L[i] + R[j]) * w);
                    dpR[i][j] = best;
                }
            }
        }

        if (p == 0) return dpR[0][q];
        if (q == 0) return dpL[p][0];
        return Math.min(dpL[p][q], dpR[p][q]);
    }
}