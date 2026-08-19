// Last updated: 8/19/2026, 10:36:02 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        for(int i=0;i<hours.length;i++)
        {
            if(hours[i]>=target)
                c++;
        }
        return c;
    }
}