public class Q2 {

    public static int BS(int arr[], int n, int x) {
        int low = 0, high = n - 1;

        int res = n;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                res = mid;
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 5, 7, 7, 7 };
        int n = arr.length;
        int x = 7;

        int res = BS(arr, n, x);
        System.out.println(res);
    }
}
