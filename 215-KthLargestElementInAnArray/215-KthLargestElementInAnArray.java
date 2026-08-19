// Last updated: 8/19/2026, 10:39:58 AM
class Solution {
    public int findKthLargest(int[] a, int k) {
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         for (int num : a) {
            pq.offer(num);
            if (pq.size() > k)
                pq.poll();
        }
         return pq.peek();
    }
}