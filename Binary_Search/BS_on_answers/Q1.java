package BS_on_answers;

public class Q1 {
    public static int sqrt(int N) {

        int st = 0;
        int en = N;
        int ans = 0;

        while (st <= en) {
            int mid = st+(en-st) / 2;
            long sqr = (long) mid * mid;

            if (sqr == N)
                return mid;
            else if (sqr > N) {
                en = mid - 1;
            } else {
                ans = mid;
                st = mid+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int N = 80;
        int sqrt = sqrt(N);
        System.out.println(sqrt);
    }
}