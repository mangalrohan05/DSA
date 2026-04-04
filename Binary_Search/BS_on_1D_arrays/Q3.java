public class Q3 {

    public static int BSU(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        int res = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 8, 9, 9, 9, 15, 19 };
        int n = 8, x = 9;
        System.out.println(BSU(arr, n, x));
    }
}
