public class median_sorted_arrs {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        int n1 = nums1.length, n2 = nums2.length;

        int left = 0, right = n1;

        while (left <= right) {
            int m1 = left + (right - left) / 2;
            int m2 = (n1 + n2 + 1) / 2 - m1;

            int l1 = (m1 == 0) ? Integer.MIN_VALUE : nums1[m1 - 1];
            int l2 = (m2 == 0) ? Integer.MIN_VALUE : nums2[m2 - 1];

            int r1 = (m1 == n1) ? Integer.MAX_VALUE : nums1[m1];
            int r2 = (m2 == n2) ? Integer.MAX_VALUE : nums2[m2];

            if (l1 <= r2 && l2 <= r1) {
                if ((n1 + n2) % 2 == 0)
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;

                return Math.max(l1, l2);
            } else if (l1 > r2)
                right = m1 - 1;
            else
                left = m1 + 1;
        }

        return 0.0;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 3 };
        int nums2[] = { 2 };

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
