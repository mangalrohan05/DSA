public class Quick {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
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

    public static void QSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            QSort(arr, low, pi - 1);
            QSort(arr, pi + 1, high);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 7, 9, 3 };
        int n = 5;

        QSort(arr, 0, n - 1);
                for(int num : arr){
            System.out.print(num + " ");
        }
    }

}
