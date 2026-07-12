class ListNode{
    ListNode next;
    int val;

    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    ListNode(int val){
        this(val, null);
    }
}

public class root {
    public static ListNode insert(ListNode head, int val){
        ListNode curr = new ListNode(val);
        curr.next = head;

        return curr;
    }
}
