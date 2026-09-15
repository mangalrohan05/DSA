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
    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> left = new Stack<>();
        Stack<TreeNode> right = new Stack<>();

        pushLeft(root, left);
        pushRight(root, right);

        while(!left.isEmpty() && !right.isEmpty() && left.peek() != right.peek()){
            int a = left.peek().val;
            int b = right.peek().val;

            int sum = a + b;
            if(sum == k) return true;

            if(sum < k) nextSmallest(left);
            if(sum > k) nextLargest(right);
        }
        return false;
    }

    public void pushLeft(TreeNode node, Stack<TreeNode> st){
        while(node != null){
            st.push(node);
            node = node.left;
        }
    }
    public void pushRight(TreeNode node, Stack<TreeNode> st){
        while(node != null){
            st.push(node);
            node = node.right;
        }
    }

    public void nextSmallest(Stack<TreeNode> st){
        TreeNode curr = st.pop();
        if(curr.right != null)
            pushLeft(curr.right, st);
    }
    public void nextLargest(Stack<TreeNode> st){
        TreeNode curr = st.pop();
        if(curr.left != null)
            pushRight(curr.left, st);
    }
}