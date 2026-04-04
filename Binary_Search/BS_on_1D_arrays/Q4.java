public class Q4 {

    public static int SIP(int arr[], int n, int t){
        int low = 0, high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid] == t){
                return mid;

            } else if (arr[mid] < t){
                low = mid+1;

            } else {
                high = mid-1;
            }
        }

        return low;
    }
    public static void main(String[] args) {
        int arr[] = {-100, -50, -10, -3, 0, 2, 5, 9, 21, 55, 120, 300}, target = 7;
        int n = arr.length;

        System.out.println(SIP(arr, n, target));
    }
}
