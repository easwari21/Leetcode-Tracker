// Last updated: 8/19/2026, 10:37:03 AM
class Solution {
    public double average(int[] salary) {
        int min=salary[0];
        int max=salary[0];
        int sum=0;
        int n=salary.length;
        for(int i=0;i<n;i++)
        {
            if(min>salary[i])
             min=salary[i];
            if(max<salary[i])
            max=salary[i];
        }
         for(int i=0;i<n;i++)
        {
            if(salary[i]!=max && salary[i]!=min)
              sum+=salary[i];
        }
        double a=(sum/((double)n-2));
        return a;
    }
}