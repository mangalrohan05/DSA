public class ith_bit_set {
    public static void main(String[] args) {
        int n = 7;
        int i = 2;

        System.out.println(((n >> (i-1)) & 1) == 1);
    }
}
