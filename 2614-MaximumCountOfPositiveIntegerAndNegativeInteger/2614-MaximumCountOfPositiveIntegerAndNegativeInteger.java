// Last updated: 8/19/2026, 10:36:07 AM
class Solution {
    public int maximumCount(int[] nums) {
        int positive=0;
        int negative=0;
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
             positive++;
            else if(nums[i]<0)
             negative++;
            else if(nums[i]==0)
             a=0;;
        }
         a=positive>negative?positive:negative;
        return a;
    }
}