public class Q1 {
    public static void main(String[] args) {
        // int arr[] = {2, 5, 1, 3, 0};
        int arr[] = { 8, 10, 5, 7, 9 };
        int l = arr[0];

        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        for (int val : arr) {
            if (val > l)
                l = val;
        }

        System.out.println("Largest: " + l);
    }
}
