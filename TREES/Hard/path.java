import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class path {

    public static ArrayList<Integer> findPath(Node root, int target) {
        ArrayList<Integer> path = new ArrayList<>();
        findRoot(root, target, path);
        return path;
    }

    public static boolean findRoot(Node root, int target, ArrayList<Integer> path) {
        if (root == null)
            return false;

        path.add(root.val);

        if (root.val == target)
            return true;

        if (findRoot(root.left, target, path))
            return true;

        if (findRoot(root.right, target, path))
            return true;

        path.remove(path.size() - 1);

        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(9);
        root.right.right = new Node(7);

        root.left.right.left = new Node(6);
        root.left.right.right = new Node(8);

        ArrayList<Integer> path = findPath(root, 7);
        System.out.println(path);
    }
}