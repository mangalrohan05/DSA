package BS_on_answers;

public class Q2 {
    public static int nthrooth(int N, int M) {

        int st = 0, en = M;

        while (st <= en) {
            int mid = st + (en - st) / 2;
            long ans = 1;

            for(int i = 0; i < N; i++){
                ans *= mid;

                if(ans > M) break;
            }

            if (ans == M)
                return mid;

            else if (ans < M) {
                st = mid + 1;
            } else {
                en = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int N = 4, M = 256;
        int res = nthrooth(N, M);
        System.out.println(res);
    }
}
