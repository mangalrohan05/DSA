class Pair {
    int val;
    int index;

    Pair(int a, int b) {
        val = a;
        index = b;
    }
}

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        for (int i = 0; i < arr.length; i++)
            pq.offer(new Pair(arr[i], i));

        int rank = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[pq.peek().index] = rank;

            if (pq.size() == 1 || pq.poll().val != pq.peek().val)
                rank++;
        }

        return arr;
    }
}