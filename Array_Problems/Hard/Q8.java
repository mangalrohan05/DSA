public class Q8 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 0, 0, 0 };
        int n2[] = { 2, 5, 6 };
        int m = 3, n = 3;
        int l = m + n;
        int a = m - 1, b = n - 1, c = l - 1;

        while (a >= 0 && b >= 0) {
            if (arr[a] < n2[b]) {
                arr[c] = n2[b];
                b--;
            } else {
                arr[c] = arr[a];
                a--;
            }
            c--;
        }

        while (b >= 0) {
            arr[c] = n2[b];
            b--;
            c--;
        }

    }
}