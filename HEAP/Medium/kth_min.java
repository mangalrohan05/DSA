import java.util.Collections;
import java.util.PriorityQueue;

public class kth_min {
    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 3, 20, 15 };
        int k = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int val : arr) {
            pq.offer(val);
            if (pq.size() > k)
                pq.poll();
        }
        System.out.println(pq.peek());
    }
}
