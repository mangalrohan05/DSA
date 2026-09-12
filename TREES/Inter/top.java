import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.TreeMap;

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class top {
    public static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();

        if (root == null)
            return res;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        Deque<SimpleEntry<Node, Integer>> q = new LinkedList<>();

        q.add(new SimpleEntry<>(root, 0));

        while (!q.isEmpty()) {
            SimpleEntry<Node, Integer> entry = q.poll();
            Node node = entry.getKey();
            int line = entry.getValue();

            if(!map.containsKey(line))
                map.put(line, node.data);

            if(node.left != null)
                q.add(new SimpleEntry<>(node.left, line-1));

            if(node.right != null)
                q.add(new SimpleEntry<>(node.right, line+1));
        }

        for(int val : map.values())
            res.add(val);
        

        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);

        ArrayList<Integer> result = topView(root);

        System.out.print("Top View Traversal: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
