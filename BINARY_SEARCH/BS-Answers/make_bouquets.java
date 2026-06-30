public class make_bouquets {
    public static boolean canMake(int bloomDay[], int m, int k, int days) {

        int adj = 0, count = 0;
        for (int day : bloomDay) {
            if (day <= days) {
                adj++;
            } else {
                adj = 0;
            }
            if (adj == k){
                adj = 0;
                count++;
            }
        }

        return count >= m;
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        if ((long) m * k > n)
            return -1;

        int left = 1, right = 0;
        for (int day : bloomDay)
            right = Math.max(right, day);

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canMake(bloomDay, m, k, mid))
                right = mid;
            else
                left = mid + 1;

        }

        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 3, 10, 2 };
        int m = 3, k = 1;

        minDays(arr, m, k);
    }
}
