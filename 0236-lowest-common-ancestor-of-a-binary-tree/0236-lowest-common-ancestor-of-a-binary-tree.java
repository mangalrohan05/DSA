/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path_p = new ArrayList<>();
        findRoot(root, p.val, path_p);

        ArrayList<TreeNode> path_q = new ArrayList<>();
        findRoot(root, q.val, path_q);

        int i = 0;
        while (path_p.size() > i && path_q.size() > i && path_p.get(i) == path_q.get(i))
            i++;

        return path_p.get(i-1);
    }

    public boolean findRoot(TreeNode root, int target, ArrayList<TreeNode> path) {
        if (root == null)
            return false;

        path.add(root);

        if (root.val == target)
            return true;

        if (findRoot(root.left, target, path))
            return true;

        if (findRoot(root.right, target, path))
            return true;

        path.remove(path.size() - 1);

        return false;
    }
}