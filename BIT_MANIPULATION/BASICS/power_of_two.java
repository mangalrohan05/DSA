public class power_of_two {
    public static void main(String[] args) {
        int n = 8;

        boolean isPower = n > 0 && (n & (n - 1)) == 0;
        System.out.println(isPower);
    }
}
