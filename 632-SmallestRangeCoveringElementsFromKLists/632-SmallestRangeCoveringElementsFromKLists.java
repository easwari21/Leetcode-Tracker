// Last updated: 8/19/2026, 10:38:26 AM
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> pq = new  PriorityQueue<>((a,b)->(a[0]-b[0]));
        int n=nums.size();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            pq.offer(new int[]{nums.get(i).get(0),i,0});
            max=Math.max(max,nums.get(i).get(0));
        }
        int rmin=0,rmax=0,rdiff=Integer.MAX_VALUE;
        while(true)
        {
            int[] curr = pq.poll();
            int val=curr[0];
            int row=curr[1];
            int col=curr[2];
            if((max-val)<rdiff)
            {
                rdiff=max-val;
                rmin=val;
                rmax=max;
            }
            if((col+1)==nums.get(row).size())
            break;
            pq.offer(new int[]{nums.get(row).get(col+1),row,col+1});
             max=Math.max(max,nums.get(row).get(col+1));
        }
        return new int[]{rmin,rmax};
    }
}