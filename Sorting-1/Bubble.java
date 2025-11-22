// import java.util.*;

public class Bubble {
    public static void main(String args[]) {
        int n = 5;
        int arr[] = { 5, 4, 2, 1, 3 };

        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped)
                break;
        }

        for (int it : arr) {
            System.out.print(it + ", ");
        }
    }
}