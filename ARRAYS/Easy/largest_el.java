public class largest_el {
    public static void largest_element(int arr[]) {
        int max = -1;

        for (int i : arr) {
            if (i > max)
                max = i;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        largest_element(arr);
    }
}