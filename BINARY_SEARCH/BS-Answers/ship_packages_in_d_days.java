public class ship_packages_in_d_days {
    public static boolean canShip(int[] weights, int days, int limit) {
        int load = 0;
        int daysUsed = 1;

        for (int w : weights) {

            if (load + w <= limit)
                load += w;
            else{
                daysUsed++;
                load = w;
            }

            if (daysUsed > days)
                return false;
        }

        return true;
    }

    public static int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int left = 0, right = 0;

        for (int w : weights) {
            left = Math.max(w, left);
            right += w;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;

        System.out.println(shipWithinDays(weights, days));

    }
}
