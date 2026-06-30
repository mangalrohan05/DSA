public class koko_eating_bananas {
    public static boolean canEat(int piles[], int h, int k) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += Math.ceil((double) piles[i] / k);
        }

        return hours <= h;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int left = 1, right = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            right = Math.max(right, piles[i]);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canEat(piles, h, mid)) {
                right = mid;
            } else {
                left = mid+1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int piles[] = { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }
}
