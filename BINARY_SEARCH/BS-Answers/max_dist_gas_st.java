public class max_dist_gas_st {

    public static boolean canMake(int arr[], int k, double mid) {
        int reqSt = 0;

        for (int i = 1; i < arr.length; i++) {
            double gap = arr[i] - arr[i - 1];

            reqSt += (int) (gap / mid);

            if(gap % mid == 0) 
                reqSt--;

            if (reqSt > k)
                return false;
        }

        return true;
    }

    public static double maxDis(int arr[], int k) {
        double left = 0, right = 0;

        for (int i = 1; i < arr.length; i++) {
            right = Math.max(right, arr[i] - arr[i - 1]);
        }

        while (right - left > 1e-6) {
            double mid = (left + right) / 2;

            if (canMake(arr, k, mid)) {
                right = mid;
            } else
                left = mid;

        }

        return right;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 4;
        System.out.println(maxDis(arr, k));
    }
}
