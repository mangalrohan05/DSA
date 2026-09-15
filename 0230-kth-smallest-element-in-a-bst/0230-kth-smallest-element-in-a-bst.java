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
    int count = 0;
    int res = 0;

    public int kthSmallest(TreeNode root, int k) {
        findInorder(root, k);
        return res;
    }

    public void findInorder(TreeNode root, int k) {
        if (root == null || count >= k)
            return;

        findInorder(root.left, k);
        count++;
        if(count == k){
            res = root.val;
            return;
        }
        findInorder(root.right, k);
    }
}