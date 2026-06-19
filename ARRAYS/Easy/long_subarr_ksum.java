public class long_subarr_ksum {
    public static void ksum(int arr[], int k) {
        int n = arr.length;
        int i = 0, j = 0, sum = 0, larg = 0;

        while (j < n) {
            sum += arr[j];

            while (i <= j && sum > k) {
                sum -= arr[i];
                i++;
            }

            if(sum == k){
                larg = Math.max(larg, j - i + 1);
            }
            j++;
        }
        System.out.println(larg);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        ksum(arr, k);
    }
}