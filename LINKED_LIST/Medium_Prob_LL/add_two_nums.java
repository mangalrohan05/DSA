public class add_two_nums {

    public static Node addNodes(Node l1, Node l2) {
        Node result = new Node(0);
        Node curr = result;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            result.next = new Node(sum % 10);
            result = result.next;

            carry = sum / 10;
        }

        return curr.next;
    }

    public static void main(String[] args) {
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node res = addNodes(l1, l2);
    }
}