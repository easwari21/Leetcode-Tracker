// Last updated: 8/19/2026, 10:39:28 AM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int size=0;
        int[] ans= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int l=0;
            int r=size;
            while(l<r)
            {
                int m=(l+r)/2;
                if(ans[m]>=nums[i])
                {
                    r=m;
                }
                else
                    l=m+1;
            }
            ans[l]=nums[i];
            if(l==size) size++;
        }
        return size;
    }
}