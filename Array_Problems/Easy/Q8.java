public class Q8 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}, n = 4;
        
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == n){
                System.out.println("Found at: " + i);
                return;
            }
        }
        System.out.println("Not Found: -1");
    }
}
