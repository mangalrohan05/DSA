public class even_odd {
    public static void main(String[] args) {
        int n = 10;

        // 0 - even, 1 - odd
        System.out.println((n & 1) == 0 ? "even" : "odd");
    }
}
