public class nth_root {
    public static int find_root(int x, int n) {
        if (x == 0 || x == 1)
            return x;

        int left = 1, right = x / n;
        int res = 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long pow = 1;
            
            for (int i = 0; i < n; i++) {
                pow *= mid;
                if (pow > x)
                    break;
            }

            if (pow == x)
                return mid;

            if (pow < x) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int x = 69, n = 4;
        System.out.println(find_root(x, n));
    }
}
