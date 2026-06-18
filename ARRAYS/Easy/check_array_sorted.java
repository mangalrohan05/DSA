public class check_array_sorted {
    public static void test(int arr[]) {

        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            int next = (i + 1) % arr.length;
            if(arr[i] > arr[next]){
                t++;
            }
            if(t>1) {
                System.out.println("NOPE");
                return;
            }
        }
        System.out.println("SORTED");
    }

    public static void main(String[] args) {
        int arr[] = { 3,4,5,1,2 };
        test(arr);
    }
}
