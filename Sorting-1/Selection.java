public class Selection {

    public static void main(String[] args){
        int arr[] = {13,46,24,52,20,9};
        int n = 6;

        for(int i = 0; i < n-1; i++){
            int min = i;

            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}