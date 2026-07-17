public class divide {
    public static void main(String[] args) {
        int dividend = 29;
        int divisor = 3;

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            System.out.println(Integer.MAX_VALUE);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int quotient = 0;

        while(a >= b){
            int shift = 0;
            while(a >= (b << (shift+1)))
                shift++;
            
            a -= b << shift;

            quotient += 1 << shift;
        }

        if((dividend < 0) ^ (divisor < 0));
            // return -quotient;

        // return quotient;
    }
}
