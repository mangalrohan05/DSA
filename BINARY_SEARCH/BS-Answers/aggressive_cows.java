import java.util.Arrays;

public class aggressive_cows {
    public static boolean canPlace(int arr[], int k, int dist) {
        int curr = 1;
        int prev = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] - prev >= dist) {
                curr++;
                prev = arr[i];
            }

        return curr >= k;
    }

    public static int agg_cows(int arr[], int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int left = 1, right = arr[n - 1] - arr[0];

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canPlace(arr, k, mid))
                left = mid+1;
            else
                right = mid - 1;
        }

        return right;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 3, 4, 7, 10, 9 };
        int k = 4;

        System.out.println(agg_cows(arr, k));
    }
}
