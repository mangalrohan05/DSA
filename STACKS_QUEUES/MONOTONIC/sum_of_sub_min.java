import java.util.Stack;

public class sum_of_sub_min {
    static int MOD = 1000000007;

    public static int[] PSE(int arr[]) {
        int n = arr.length;
        int pse[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                pse[i] = -1;
            } else {
                pse[i] = st.peek();
            }
            st.push(i);
        }

        return pse;
    }

    public static int[] NSE(int arr[]) {
        int n = arr.length;
        int nse[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nse[i] = n;
            } else {
                nse[i] = st.peek();
            }
            st.push(i);
        }

        return nse;
    }

    public static int findSum(int arr[]) {
        int n = arr.length;
        long sum = 0;

        int pse[] = PSE(arr);
        int nse[] = NSE(arr);

        for (int i = 0; i < n; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            sum = (sum + ((long) arr[i] * left * right) % MOD) % MOD;
        }

        return (int) sum;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 4 };
        System.out.println(findSum(arr));
    }

}