import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int max = Integer.MIN_VALUE, sum = 0, start = -1, resend = -1, res = -1;

        for (int i = 0; i < arr.length; i++) {
            if (sum == 0)
                start = i;

            sum += arr[i];

            if (sum > max) {
                max = sum;
                res = start;
                resend = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println(sum + "\n" + res + "\n" + resend);

        for (int val : Arrays.copyOfRange(arr, res, resend + 1)) {
            System.out.print(val + " ");
        }
    }
}
