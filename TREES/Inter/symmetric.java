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

public class symmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return true;

        Deque<TreeNode> left = new LinkedList<>();
        Deque<TreeNode> right = new LinkedList<>();

        left.offer(root.left);
        right.offer(root.right);

        while (!left.isEmpty() && !right.isEmpty()) {
            TreeNode l = left.poll();
            TreeNode r = right.poll();

            if (l.val != r.val)
                return false;

            if (l.left != null && r.left != null) {
                left.offer(l.left);
                right.offer(r.left);
            }

            if (l.right != null && r.right != null) {
                left.offer(l.right);
                right.offer(r.right);
            }
        }
        
        return true;
    }

    public void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.right.left = new TreeNode(3);

        System.out.println(isSymmetric(root));

    }
}