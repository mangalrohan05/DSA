public class good_numbers {

    static final int MOD = 1_000_000_007;

    public long countGood(long n) {

        long even = (n + 1) / 2;
        long odd = n / 2;

        return (power(5, even) * power(4, odd)) % MOD;
    }

    public long power(long base, long exp) {
        if (exp == 0)
            return 1;

        long half = power(base, exp / 2);

        long res = (half * half) % MOD;

        if (exp % 2 == 1)
            res = (res * base) % MOD;

        return res;
    }

    public static void main(String[] args) {

    }
}