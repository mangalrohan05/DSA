public class linear_search {
    public static int LSearch(int arr[], int n) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 3;
        int res = LSearch(arr, k);
        System.out.println(res);
    }
}
