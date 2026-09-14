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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);

        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    public TreeNode build(int[] preorder, int preSt, int preEn, int[] inorder, int inSt, int inEn, Map<Integer, Integer> map){
        if(preSt > preEn || inSt > inEn) return null;

        TreeNode root = new TreeNode(preorder[preSt]);

        int inRoot = map.get(root.val);
        int numsLeft = inRoot - inSt;

        root.left = build(preorder, preSt + 1, preSt + numsLeft, inorder, inSt, inRoot - 1, map);
        root.right = build(preorder, preSt + numsLeft + 1, preEn, inorder, inRoot + 1, inEn, map);

        return root;
    }
}