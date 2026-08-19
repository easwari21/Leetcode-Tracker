// Last updated: 8/19/2026, 10:36:18 AM
class Solution {
    public long minimumDifference(int[] nums) {
        int l = nums.length;
        int n=l/3;
        long[] left=new long[l];
        long[] right=new long[l];
        long lsum=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<l;i++)
        {
            pq.offer(nums[i]);
            lsum=lsum+nums[i];
            if(pq.size()>n)
            lsum=lsum-pq.poll();
            if(pq.size()==n)
            left[i]=lsum;
        }
        long rsum=0;
        PriorityQueue<Integer> pq1= new PriorityQueue<>();
        for(int i=l-1;i>=0;i--)
        {
            pq1.offer(nums[i]);
            rsum=rsum+nums[i];
            if(pq1.size()>n)
            rsum=rsum-pq1.poll();
            if(pq1.size()==n)
            right[i]=rsum;
        }
        long res=Long.MAX_VALUE;
        for(int i=n-1;i<2*n;i++)
        res=Math.min(res,left[i]-right[i+1]);
        return res;
    }
}