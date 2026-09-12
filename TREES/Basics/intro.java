class Node {
    Node left;
    Node right;
    int key;

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

/**
 * intro
 */
public class intro {

    public static Node createBTree() {
        Node root = new Node(0);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(5);

        return root;
    }

    public static void main(String[] args) {
        // Node root = createBTree();
    }
}