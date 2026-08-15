import java.util.PriorityQueue;

public class kth_largest {

    public static int findMax(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int val : arr) {
            pq.offer(val);
            if (pq.size() > k)
                pq.poll();
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 2;

        System.out.println(findMax(arr, k));
    }
}