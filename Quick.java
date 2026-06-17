public class Quick {

    public static int pivot(int arr[], int low, int high) {
        int piv = arr[high], i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < piv) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void QuickSort(int arr[], int low, int high) {
        if (low < high) {
            int piv = pivot(arr, low, high);
            QuickSort(arr, low, piv - 1);
            QuickSort(arr, piv + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        QuickSort(arr, 0, arr.length - 1);

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
