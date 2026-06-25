public class repeating_missing_number {
    public static void find_nums(int arr[]) {
        int n = arr.length;

        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
            xor ^= (i + 1);
        }

        int num = (xor & ~(xor - 1));

        int zero = 0, one = 0;

        for (int i = 0; i < n; i++) {
            if ((arr[i] & num) != 0) {
                one ^= arr[i];
            } else {
                zero ^= arr[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            if ((i % num) != 0) {
                one ^= i;
            } else {
                zero ^= i;
            }
        }

        int cnt = 0;
        for (int val : arr) {
            if (val == zero)
                cnt++;
        }

        if (cnt == 2) {
            System.out.println(zero + " " + one);
        }
        System.out.println(one + " " + zero);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6, 7, 5, 7 };
        find_nums(arr);
    }
}
