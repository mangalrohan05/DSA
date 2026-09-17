class Solution {
    public int minMaxGame(int[] nums) {
        Queue<Integer> q = new LinkedList<>();
        for(int val : nums)
            q.offer(val);

        boolean min = true;

        while(q.size() > 1){
            int curr = 0;

            while(curr < q.size() && q.size() >= 2){
                int a = q.poll();
                int b = q.poll();

                if(min)
                    q.offer(Math.min(a, b));
                else 
                    q.offer(Math.max(a, b));

                min = !min;
            }
        }

        return q.poll();
    }
}