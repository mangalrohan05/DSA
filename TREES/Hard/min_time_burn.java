import java.util.*;

public class min_time_burn {

    public static int minTime(Node root, int target) {

        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        buildGraph(root, null, graph);

        Set<Integer> vis = new HashSet<>();

        Queue<Integer> q = new LinkedList<>();
        q.offer(target);
        vis.add(target);

        int time = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            boolean burned = false;

            for (int i = 0; i < size; i++) {
                int node = q.poll();

                for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                    if (!vis.contains(neighbor)) {
                        vis.add(neighbor);
                        q.offer(neighbor);
                        burned = true;
                    }
                }
            }
            if (burned)
                time++;
        }

        return time;
    }

    public static void buildGraph(Node root, Node parent, Map<Integer, List<Integer>> graph) {
        if (root == null)
            return;

        if (parent != null) {
            graph.computeIfAbsent(root.val, k -> new ArrayList<>()).add(parent.val);
            graph.computeIfAbsent(parent.val, k -> new ArrayList<>()).add(root.val);
        }

        buildGraph(root.left, root, graph);
        buildGraph(root.right, root, graph);
    }

    public static void main(String[] args) {

        StringBuilder name = new StringBuilder();
        name.append("/rohan");
        name.append("/mangal");
        name.append("/" + 0);

        System.out.println(name);
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.right.left = new Node(5);
        // root.right.right = new Node(6);
        // root.left.left.right = new Node(7);

        // int target = 1;

        // // Print the result
        // System.out.println("Minimum time to burn the tree: " + minTime(root, target));
    }
}
