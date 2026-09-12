/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static class Pair{
        TreeNode node;
        int vertical;
        int level;

        Pair(TreeNode n, int v, int l){
            this.node = n;
            this.vertical = v;
            this.level = l;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> nodes = new TreeMap<>();

        Queue<Pair> todo = new LinkedList<>();

        todo.offer(new Pair(root, 0, 0));

        while(!todo.isEmpty()){

            Pair p = todo.poll();
            TreeNode temp = p.node;
            int x = p.vertical;
            int y = p.level;

            nodes.putIfAbsent(x, new TreeMap<>());
            nodes.get(x).putIfAbsent(y, new PriorityQueue<>());
            nodes.get(x).get(y).offer(temp.val);

            if(temp.left != null)
                todo.offer(new Pair(temp.left, x-1, y+1));

            if(temp.right != null)
                todo.offer(new Pair(temp.right, x+1, y+1));
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(TreeMap<Integer, PriorityQueue<Integer>> r : nodes.values()){
            List<Integer> col = new ArrayList<>();

            for(PriorityQueue<Integer> pq : r.values()){
                while(!pq.isEmpty()){
                    col.add(pq.poll());
                }
            }
            ans.add(col);
        }

        return ans;
    }
}