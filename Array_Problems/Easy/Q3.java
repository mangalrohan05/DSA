public class Q3 {
    
    public static boolean status(int arr[]){
        int n = arr.length;

        if (n <= 1) return true;

        for(int i = 0; i < n-1; i++){
            if(arr[i+1] < arr[i]) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        int arr[] = {5,4,6,7,8};

        System.out.println("Status: "+ status(arr));
    }
}
