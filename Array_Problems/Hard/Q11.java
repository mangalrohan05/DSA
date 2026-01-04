public class Q11 {

    public static int merge(int arr[], int left, int mid, int right) {
        int temp[] = new int[right - left + 1];

        int l = left;
        int r = mid + 1;
        int k = 0;

        int cnt = 0;

        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                temp[k++] = arr[l++];
            } else {
                temp[k++] = arr[r++];
                cnt += (mid - l + 1);
            }
        }

        while (l <= mid) {
            temp[k++] = arr[l++];
        }

        while (r <= right) {
            temp[k++] = arr[r++];
        }

        for (int i = left; i <= right; i++) {
            arr[i] = temp[i - left];
        }

        return cnt;
    }

    public static int MS(int arr[], int st, int en) {
        int count = 0;

        if (en <= st) {
            return count;
        }

        int mid = (en + st) / 2;
        count += MS(arr, st, mid);
        count += MS(arr, mid + 1, en);  
        count += merge(arr, st, mid, en);

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1, 4 };
        int n = arr.length;

        int c = MS(arr, 0, n - 1);
        System.out.println(c);
    }
}
