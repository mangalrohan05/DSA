import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class hand_of_straights {

    public static boolean isNStraightHand(int arr[], int grpSize) {

        if (arr.length % grpSize != 0)
            return false;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : arr)
            map.put(val, map.getOrDefault(val, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            pq.offer(new Pair(entry.getKey(), entry.getValue()));

        map.clear();
        int size = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            if (size < grpSize-1 && pq.peek().val - curr.val != 1)
                return false;
            curr.index--;

            if (curr.index > 0)
                map.put(curr.val, curr.index);

            size++;

            if (size == grpSize) {
                size = 0;
                if (!map.isEmpty())
                    for (Map.Entry<Integer, Integer> entry : map.entrySet())
                        pq.offer(new Pair(entry.getKey(), entry.getValue()));
                map.clear();
            }

        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6, 2, 3, 4, 7, 8 };
        int grpSize = 3;

        System.out.println(isNStraightHand(arr, grpSize));
    }
}
