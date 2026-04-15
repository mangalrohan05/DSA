public class Q6 {

    public static int daysNeeded(int weights[], int capacity){
        int days = 1;
        int curr = 0;

        for(int w : weights){
            if(curr + w > capacity){
                days++;
                curr = w;
            } else {
                curr += w;
            }
        }

        return days;
    }

    public static int capacity(int weights[], int days) {
        int st = 1, en = 0;

        for(int val : weights){
            st = Math.max(val, st);
            en += val;
        }

        while (st <= en) {
            int mid = (st+en)/2;

            int needed = daysNeeded(weights, mid);

            if(needed <= days){
                en = mid-1;
            } else {
                st = mid+1;
            }
        }

        return st;
    }

    public static void main(String[] args) {
        int weights[] = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        int days = 5;

        int res = capacity(weights, days);
        System.out.println(res);
    }
}