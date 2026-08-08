import java.util.ArrayDeque;
import java.util.Deque;

class pair {
    int idx;
    int value;

    public pair(int idx, int value) {
        this.idx = idx;
        this.value = value;
    }
}

public class sliding_window_maxm {
    public static int[] maxSlidingWindow(int[] nums, int k) {

        if (k == 1 || nums == null || nums.length == 0)
            return nums;

        int n = nums.length;
        int res[] = new int[n - k + 1];

        Deque<pair> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!q.isEmpty() && q.peekFirst().idx < i - k + 1) {
                q.pollFirst();
            }

            while (!q.isEmpty() && q.peekLast().value < nums[i]) {
                q.pollLast();
            }

            q.offerLast(new pair(i, nums[i]));

            if(i >= k-1){
                res[i-k+1] = q.peekFirst().value;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        int res[] = maxSlidingWindow(arr, k);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}