public class Bubble {
    public static void BubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            boolean swap = false;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }

            if(!swap) break;
        }

        for (int i : arr)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        BubbleSort(arr);
    }
}
