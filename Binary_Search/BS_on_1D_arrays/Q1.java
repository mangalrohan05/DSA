public class Q1 {
    public static void main(String[] args) {
        int arr[] = { -1,0,3,5,9,12 };
        int n = arr.length;
        int e = 3;

        int low = 0, high = n - 1;

        int mid = low + (high - low) / 2;

        while (low <= high) {
            if (arr[mid] == e) {
                System.out.println(mid);
                return;
            }



            if (arr[mid] < e) {
                low = mid+1;
            } else {
                high = mid-1;
            }

            mid = low + (high - low)/2;
        }
        System.out.println("Nothing found");
    }
}