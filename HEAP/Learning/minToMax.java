public class minToMax {

    public static void heapify(int arr[], int n, int i) {
        while (true) {
            int max = i;

            int left = i * 2 + 1;
            int right = i * 2 + 2;

            if (left < n && arr[left] > arr[max])
                max = left;
            if (right < n && arr[right] > arr[max])
                max = right;

            if (max == i)
                break;

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            i = max;
        }
    }

    public static int[] convert(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 21, 23 };

        int res[] = convert(arr);

        for (int val : res)
            System.out.print(val + " ");
    }
}
