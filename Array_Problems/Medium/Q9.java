public class Q9 {
    public static void main(String[] args) {

        int arr[] = { 4, 7, 1, 0 };
        int n = arr.length;
        int max = arr[n-1];

        System.out.println(max);
        for(int i = n-2; i >= 0; i--){
            if(arr[i] >= max){
                max = arr[i];
                System.out.println(max);
            }
        }
    }

}
