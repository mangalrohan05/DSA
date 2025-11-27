public class Q11 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1};
        int curr = 0;
        int h = 0;

        for (int v : arr) {
            if(v == 1) curr++;

            if(h < curr) h = curr;

            if (v!=1) curr = 0;
        }

        System.out.println(h);
    }
}