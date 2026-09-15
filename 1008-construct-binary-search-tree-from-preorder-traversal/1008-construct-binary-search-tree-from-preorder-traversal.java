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
    public TreeNode bstFromPreorder(int[] preorder) {
        return addToTree(preorder, 0, preorder.length-1);
    }

    public TreeNode addToTree(int[] preorder, int st, int en){
        if(st > en)
            return null;
        
        TreeNode root = new TreeNode(preorder[st]);
        int i = st + 1;
        while(i <= en && preorder[i] < root.val)
            i++;

        root.left = addToTree(preorder, st+1, i - 1);
        root.right = addToTree(preorder, i, en);

        return root;
    }
}