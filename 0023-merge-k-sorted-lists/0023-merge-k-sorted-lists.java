/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(ListNode ls : lists)
            while(ls != null){
                pq.offer(ls.val);
                ls = ls.next;
            }

        ListNode head = null;

        int n = pq.size();
        while(!pq.isEmpty()){
            ListNode curr = new ListNode(pq.poll());
            curr.next = head;
            head = curr;
        }

        return head;
    }
}