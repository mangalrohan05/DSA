public class painters_partition {
    public static boolean canPaint(int borads[], int k, int limit) {
        int timePainted = 0, painters = 1;

        for (int pages : borads) {
            if (timePainted + pages > limit) {
                timePainted = pages;
                painters++;
            } else {
                timePainted += pages;
            }

            if (painters > k) {
                return false;
            }
        }

        return true;
    }

    public static int minTime(int borads[], int k) {
        int n = borads.length;
        int left = 0, right = 0;

        for (int val : borads) {
            left = left >= val ? left : val;
            right += val;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canPaint(borads, k, mid))
                right = mid;
            else
                left = mid + 1;
        }

        return left;

    }

    public static void main(String[] args) {
        int borads[] = { 5, 5, 5, 5 };
        int k = 2;

        System.out.println(minTime(borads, k));
    }
}