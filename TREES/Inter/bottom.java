import java.util.*;

class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class bottom {

    public static ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        
        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair curr = q.poll();
            int line = curr.hd;
            int val = curr.node.data;

            map.put(line, val);

            if(curr.node.left != null)
                q.offer(new Pair(curr.node.left, curr.hd - 1));

            if(curr.node.right != null)
                q.offer(new Pair(curr.node.right, curr.hd + 1));
        }

        res.addAll(map.values());

        return res;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);


        // Get the Bottom View traversal
        ArrayList<Integer> bottomView = bottomView(root);

        // Print the result
        System.out.println("Bottom View Traversal: ");
        for (int node : bottomView) {
            System.out.print(node + " ");
        }

    }
}
