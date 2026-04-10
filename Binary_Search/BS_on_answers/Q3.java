public class Q3 {

    // public static int check(int[] piles, int h, int n) {
    // int res = piles[0];
    // // int st = 0, en = n - 1;

    // for (int i = 0; i < n; i++) {
    // res = Math.max(res, piles[i]);
    // }

    // for (int j = 1; j < res+1; j++) {
    // int curr = h;

    // for (int i = 0; i < n; i++) {
    // curr -= (piles[i] + j - 1) / j;
    // }

    // if (curr >= 0)
    // return j;

    // res = j;
    // }

    // return res;
    // }

    public static int check(int[] piles, int h, int n) {

        int en = 0, st = 1;

        for (int i = 0; i < n; i++)
            en = Math.max(en, piles[i]);

        while (st <= en) {
            int mid = (st + en) / 2;

            int curr = h;

            for (int i = 0; i < n; i++) {
                curr -= (piles[i] + mid - 1) / mid;
            }

            if (curr >= 0)
                en = mid - 1;

            else
                st = mid+1;
        }

        return st;
    }

    public static void main(String[] args) {
        int piles[] = { 3,6,7,11 };
        int h = 8;
        int n = piles.length;
        int res = check(piles, h, n);
        System.out.println(res);
    }
}
