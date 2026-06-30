public class kth_missing {
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;

        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            int missing = arr[mid] - mid - 1;

            if (missing >= k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left + k;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 7, 11 };
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }
}
