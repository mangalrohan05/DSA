class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
            return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : hand)
            map.put(val, map.getOrDefault(val, 0) + 1);

        PriorityQueue<Integer> pq = new PriorityQueue<>(map.keySet());

        while (!pq.isEmpty()) {
            int first = pq.peek();
            if(map.get(first) == 0){
                pq.poll();
                continue;
            }

            int req = map.get(first);

            for(int i = 0; i < groupSize; i++){
                int card = first+i;
                Integer count = map.get(card);
                if(count == null || count < req) return false;
                map.put(card, count-req);
            }
        }

        return true;
    }
}