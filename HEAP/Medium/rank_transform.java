import java.util.Arrays;
import java.util.HashMap;
// import java.util.PriorityQueue;

class Pair {
    int val;
    int index;

    Pair(int a, int b) {
        val = a;
        index = b;
    }
}

public class rank_transform {

    // public static int[] SortRank(int arr[]) {

    // PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val,
    // b.val));

    // for (int i = 0; i < arr.length; i++)
    // pq.offer(new Pair(arr[i], i));

    // int rank = 1;

    // while(!pq.isEmpty()) {
    // Pair curr = pq.poll();
    // arr[curr.index] = rank;

    // if (pq.isEmpty() || curr.val != pq.peek().val)
    // rank++;
    // }

    // return arr;
    // }

    public static int[] SortRank(int arr[]) {

        int res[] = arr.clone();
        Arrays.sort(res);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int i = 0; i < arr.length; i++)
            if (!map.containsKey(res[i])) {
                map.put(arr[i], rank);
                rank++;
            }

        for(int i = 0; i < arr.length; i++)
            arr[i] = map.get(arr[i]);
        

        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 10, 10 };

        int res[] = SortRank(arr);

        for (int val : res)
            System.out.print(val + " ");
    }
}
