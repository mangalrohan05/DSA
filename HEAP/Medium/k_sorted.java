import java.util.PriorityQueue;

class Pair {
    int val;
    int index;

    Pair(int val, int index) {
        this.val = val;
        this.index = index;
    }
}

public class k_sorted {

    public static boolean isKSortedArray(int arr[], int k) {


        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.val != b.val
                ? Integer.compare(a.val, b.val)
                : Integer.compare(a.index, b.index));

        for (int i = 0; i < arr.length; i++) {
            pq.offer(new Pair(arr[i], i));
        }

        for (int i = 0; i < arr.length; i++)
            if (Math.abs(pq.poll().index - i) > k)
                return false;

        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 13, 8, 10, 7, 15, 14, 12 };
        int k = 1;

        System.out.println(isKSortedArray(arr, k));
    }
}