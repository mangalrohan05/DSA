public class sqrt_of_number {
    public static int find_sqrt(int n) {

        if (n < 3)
            return 1;

        int left = 1, right = n / 2;
        int res = 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long sq = (long) mid * mid;
            if (sq == n)
                return mid;

            if (sq < n) {
                res = mid;
                left = mid + 1;
            } else
                left = mid - 1;
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 88;
        System.out.println(find_sqrt(n));
    }
}