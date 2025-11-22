
public class Insertion {

    public static void main(String args[]){
        int arr[] = {13,46,24,52,20,9};
        int n = 6;

        for(int i = 0; i < n; i++){
            int j = i;

            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}