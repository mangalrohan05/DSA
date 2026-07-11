public class sort {

    public static Node merge(Node left, Node right){

        Node res = new Node(-1);
        Node curr = res;

        while (left != null && right != null) {
            if(left.data <= right.data){
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }

            curr = curr.next;
        }

        if(left != null)
            curr.next = left;
        
        if(right != null)
            curr.next = right;

        return res.next;
    }

    public static Node getMid(Node head) {
        Node mid = head;
        Node en = head.next;

        while (en != null && en.next != null) {
            mid = mid.next;
            en = en.next.next;
        }

        return mid;
    }

    public static Node MSort(Node head) {

        if (head == null || head.next == null)
            return head;

        Node mid = getMid(head);
        Node right = mid.next;
        mid.next = null;

        
        Node left = MSort(head);
        right = MSort(right);

        return merge(left, right);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 4 };
        Node head = null;

        for (int x : arr)
            head = insert.insertNode(head, x);

        head = MSort(head);
    }
}