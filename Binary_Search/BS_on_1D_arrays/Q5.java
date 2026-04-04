public class Q5 {

    public static void FC(int arr[], int n, int x){
        int low = 0, high = n-1;
        int floor = -1,ciel=-1;

        while( low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid] == x){
                floor = ciel = mid;
                break;
            } else if(arr[mid] < x){
                floor = mid;
                low = mid+1;

            } else {
                ciel = mid;
                high = mid-1;
            }
        }
        System.out.println(arr[floor == -1 ? 0:floor] + "\n" + arr[ciel]);
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 4, 7, 8, 10}, x = 5;
        int n = arr.length;
        FC(arr, n, x);
    }
}
