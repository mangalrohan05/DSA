public class min_pages_book {
    public static boolean canRead(int books[], int m, int limit) {
        int pages_read = 0, st = 1;

        for (int pages : books) {
            if (pages_read + pages > limit) {
                pages_read = pages;
                st++;
            } else {
                pages_read += pages;
            }

            if (st > m) {
                return false;
            }
        }

        return true;
    }

    public static int max_pages(int books[], int m) {
        int n = books.length;
        int left = 0, right = 0;

        for (int val : books) {
            left = left >= val ? left : val;
            right += val;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canRead(books, m, mid))
                right = mid;
            else
                left = mid + 1;
        }

        return left;

    }

    public static void main(String[] args) {
        int books[] = { 12, 34, 67, 90 };
        int m = 2;

        System.out.println(max_pages(books, m));
    }
}