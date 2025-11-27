public class Q13 {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 9 }, k = 15;

        int n = arr.length, h = 0, l = 0, r = 0, sum = arr[0];

        while(r < n){
            while (l <= r && sum > k) {
                sum -= arr[l];
                l++;
            }

            if(sum == k) { 
                h = Math.max(h, r-l+1);
            }

            r++;

            if(r < n){
                sum += arr[r];
            }
        }

        System.out.println(h);
    }
}
