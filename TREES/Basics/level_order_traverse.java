import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        ls.add(levelorder(root, ls));
        return ls;
    }

    public List<Integer> levelorder(TreeNode root, List<Integer> ls) {
        if (root == null)
            return ls;
        if(root.left != null)
            ls.add(root.left.val);
        if(root.right != null)
            ls.add(root.right.val);
        levelorder(root.left, ls);
        levelorder(root.right, ls);

        return ls;
    }
}