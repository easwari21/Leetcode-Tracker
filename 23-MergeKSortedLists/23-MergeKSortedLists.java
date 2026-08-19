// Last updated: 8/19/2026, 10:42:12 AM
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
        PriorityQueue<ListNode> pq = new  PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));
        ListNode res = new ListNode(0);
        ListNode temp =res;
        for(ListNode l:lists)
        {
            if(l!=null)
            pq.offer(l);
        }
        while(!pq.isEmpty())
        {
            ListNode nn=pq.poll();
            temp.next=nn;
            temp=temp.next;
            if(nn.next!=null)
            pq.offer(nn.next);
        }
        return res.next;
    }
}