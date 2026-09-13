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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        Queue<Pair<TreeNode, Long>> q = new LinkedList<>();
        q.offer(new Pair<>(root, 0L));

        long max = 0;

        while(!q.isEmpty()){
            int size = q.size();

            long f = q.peek().getValue();
            long l = f;

            for(int i = 0; i < size; i++){
                Pair<TreeNode, Long> curr = q.poll();

                TreeNode node = curr.getKey();
                long idx = curr.getValue() - f;
                l = idx;

                if(node.left != null) q.offer(new Pair<>(node.left, 2 * idx));
                if(node.right != null) q.offer(new Pair<>(node.right, 2 * idx + 1));
            }

            max = Math.max(max, l + 1);
        }

        return (int)max;
    }
}