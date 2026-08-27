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
    int diam = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        diamAtNode(root);
        return diam;
    }

    public int diamAtNode(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = diamAtNode(root.left);
        int right = diamAtNode(root.right);

        diam = Math.max(diam, left + right);
        return 1 + Math.max(left, right);
    }
}