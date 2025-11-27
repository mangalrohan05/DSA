public class Q12 {
    public static void main(String[] args) {
        int arr[] = {2, 2, 1};
        int curr = 0;

        for(int v : arr) {
            curr ^= v;
        }
        System.out.println(curr);
    }
}
