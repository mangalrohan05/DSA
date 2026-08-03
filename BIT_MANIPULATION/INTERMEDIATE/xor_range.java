public class xor_range {
    public static int resXor(int n) {
        if (n % 4 == 1)
            return 1;
        if (n % 4 == 2)
            return n + 1;
        if (n % 4 == 3)
            return 0;
        return n;
    }

    public static int XorRange(int L, int R) {
        return resXor(L-1) ^ resXor(R); 
    }

    public static void main(String[] args) {
        System.out.println(XorRange(3, 5));
    }
}