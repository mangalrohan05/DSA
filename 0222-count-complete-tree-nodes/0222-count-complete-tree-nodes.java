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
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        int lh = LeftHeight(root);
        int rh = RightHeight(root);

        if(lh == rh)
            return (1<<lh) - 1;
        
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int LeftHeight(TreeNode left){
        int h = 0;
        while(left != null){
            h++;
            left = left.left;
        }
        return h;
    }

    public int RightHeight(TreeNode right){
        int h = 0;
        while(right != null){
            h++;
            right = right.right;
        }
        return h;
    }

    
}