/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "#";

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        StringBuilder res = new StringBuilder();

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr == null) {
                res.append("#,");
                continue;
            }

            res.append(curr.val).append(",");

            q.offer(curr.left);
            q.offer(curr.right);
        }

        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("#"))
            return null;

        String[] nodes = data.split(",");

        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int i = 1;
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (!nodes[i].equals("#")) {
                curr.left = new TreeNode(Integer.parseInt(nodes[i]));
                q.offer(curr.left);
            }
            i++;

            if (!nodes[i].equals("#")) {
                curr.right = new TreeNode(Integer.parseInt(nodes[i]));
                q.offer(curr.right);
            }
            i++;
        }

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));