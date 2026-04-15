public class Q4 {

    public static int days(int bloomday[], int m, int k) {

        int n = bloomday.length;
        if ((long) m * k > n)
            return -1;

        int max = bloomday[0];
        int st = 1;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, bloomday[i]);
        }

        while (st <= max) {
            int mid = (st + max) / 2;

            if (check(bloomday, m, k, mid)) {
                max = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return st;
    }

    public static boolean check(int bloomday[], int m, int k, int mid) {
        int count = 0, bouq = 0;

        for (int val : bloomday) {
            if (val <= mid) {
                count++;
                if (count == k) {
                    bouq++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return bouq >= m;
    }

    public static void main(String[] args) {
        int bloomday[] = { 1, 10, 3, 10, 2 };
        int m = 3, k = 1;

        int res = days(bloomday, m, k);
        System.out.println(res);
    }
}
