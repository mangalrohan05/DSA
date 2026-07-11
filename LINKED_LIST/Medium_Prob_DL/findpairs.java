import java.util.ArrayList;

public class findpairs {
    public static ArrayList<int[]> findPairs(Node head, int target) {
        
        ArrayList<int[]> ls = new ArrayList<>();

        Node left = head;

        while (head.next != null) {
            head = head.next;
        }
        Node right = head;

        while (left != right && right.next != left) {
            int sum = left.data + right.data;

            if (sum == target) {
                int[] res = { left.data, right.data };
                ls.add(res);
                left = left.next;
                right = right.prev;

            } else if (sum < target) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }

        return ls;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 8, 9 };
        Node head = null;
        for (int x : arr)
            head = root.insert(head, x);

        ArrayList<int[]> ls = findPairs(head, 7);
    }
}
