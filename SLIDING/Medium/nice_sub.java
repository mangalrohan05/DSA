public class nice_sub {

    public static int countNice(int nums[], int k) {
        
        int total = 0;
        int count = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (count == k) {
                total++;
            }

            while (count > k) {
                if (nums[left] % 2 != 0)
                    count--;
                left++;
            }

            if (nums[right] % 2 != 0)
                count++;
        }

        return total;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 };
        int k = 2;

        System.out.println(countNice(arr, k));
    }
}
