public class flip_bits {
    public static void main(String[] args) {
        int s = 3;
        int g = 4;

        int res = s ^ g;
        int count = 0;

        while (res > 0) {
            res = res & (res-1);
            count++;
        }

    }
}