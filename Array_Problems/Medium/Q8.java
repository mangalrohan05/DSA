public class Q8 {

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2 };
        int idx = -1, n = arr.length;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1)
            reverse(arr);
        else {
            for (int i = n - 1; i > idx; i--) {
                if (arr[i] > arr[idx]) {
                    int temp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = temp;
                    break;
                }
            }

            int left = idx + 1;
            int right = arr.length - 1;

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        for(int val : arr){
            System.out.print(val+", ");
        }

    }
}
