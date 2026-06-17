public class Insertion {
    public static void InsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }

        for (int i : arr)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        InsertionSort(arr);
    }
}
