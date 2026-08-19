// Last updated: 8/19/2026, 10:35:34 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        return sum%k;
    }
}