import java.util.Stack;

public class sum_of_sub_arr_ranges {

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

    public static int[] PGE(int arr[]) {
        int n = arr.length;
        int pge[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                pge[i] = -1;
            } else {
                pge[i] = st.peek();
            }
            st.push(i);
        }
        
        return pge;
    }
   
    public static int[] NGE(int arr[]) {
        int n = arr.length;
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nge[i] = n;
            } else {
                nge[i] = st.peek();
            }
            st.push(i);
        }
        
        return nge;
    }

    public static long findSum(int arr[]) {
        int n = arr.length;
        long sum = 0;

        int pse[] = PSE(arr);
        int nse[] = NSE(arr);
        int pge[] = PGE(arr);
        int nge[] = NGE(arr);

        for (int i = 0; i < n; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;

            int maxLeft = i - pge[i];
            int maxRight = nge[i] - i;

            long minContribution = ((long) arr[i] * left * right);
            long maxContribution = ((long) arr[i] * maxLeft * maxRight);
            sum = (sum + maxContribution - minContribution);
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(findSum(arr));
    }

}