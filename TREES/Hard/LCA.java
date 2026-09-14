import java.util.ArrayList;
import java.util.HashMap;

public class LCA {
    static HashMap<Integer, Node> map = new HashMap<>();

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        ArrayList<Integer> path_p = new ArrayList<>();
        findRoot(root, p.val, path_p);

        ArrayList<Integer> path_q = new ArrayList<>();
        findRoot(root, q.val, path_q);

        int i = 0;
        
        while (path_p.get(i) == path_q.get(i))
            i++;

        return map.get(path_p.get(i-1));

    }

    public static boolean findRoot(Node root, int target, ArrayList<Integer> path) {
        if (root == null)
            return false;

        map.put(root.val, root);

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

        Node res = lowestCommonAncestor(root, root.left.left, root.left.right.right);
        System.out.println(res.val);
    }
}
