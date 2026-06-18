public class rotate_array {

    public static void reverse(int arr[], int st, int en) {

        while (st <= en) {
            int temp = arr[st];
            arr[st] = arr[en];
            arr[en] = temp;
            st++;
            en--;
        }

    }

    public static void rotate(int arr[], int k, int n) {
        k %= n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);

        for(int val : arr){
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(arr, k, arr.length);
    }
}
