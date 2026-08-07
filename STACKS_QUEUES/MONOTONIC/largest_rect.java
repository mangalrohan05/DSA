import java.util.Stack;

public class largest_rect {

    public static int[] PSE(int[] arr) {

        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
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

    public static int[] NSE(int[] arr) {
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nse[i] = arr.length;
            } else {
                nse[i] = st.peek();
            }

            st.push(i);
        }

        return nse;
    }

    public static int find_max_area(int arr[]) {
        int max_area = 0;
        int pse[] = PSE(arr);
        int nse[] = NSE(arr);

        for (int i = 0; i < arr.length; i++) {
            int area = arr[i] * (nse[i] - pse[i] - 1);
            max_area = Math.max(max_area, area);
        }

        return max_area;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 2, 3, 4 };
        System.out.println(find_max_area(arr));
    }
}
