public class times_array_rotated {
    public static int find_rotation(int arr[]) {
        if (arr == null || arr.length == 0)
            return -1;
        
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[left] < arr[right])
                return left;

            else {
                if (arr[mid] > arr[right])
                    left = mid + 1;
                else
                    right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        System.out.println(find_rotation(arr));
    }
}
