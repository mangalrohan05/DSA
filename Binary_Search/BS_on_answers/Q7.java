public class Q7 {

    public static int missing(int arr[], int k) {
        int st = 0, en = arr.length - 1;

        while (st <= en) {
            int mid = (st + en) / 2;

            int missing = arr[mid] - mid + 1;

            if (missing < k) {
                st = mid + 1;
            } else {
                en = mid - 1;
            }
        }

        return st+k;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 7, 11 };
        int k = 5;
        int res = missing(arr, k);
        System.out.println(res);
    }
}